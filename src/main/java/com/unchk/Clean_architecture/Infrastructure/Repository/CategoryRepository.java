package com.unchk.Clean_architecture.Infrastructure.Repository;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;
import com.unchk.Clean_architecture.Domain.Gateway.CategoryRepositoryInterface;
import com.unchk.Clean_architecture.Infrastructure.Mapper.CategoryMapper;
import com.unchk.Clean_architecture.Infrastructure.Models.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository implements CategoryRepositoryInterface {
    private final CategoryJPaRepository repository;
    private final CategoryMapper mapper;

    public CategoryRepository(CategoryJPaRepository repository, CategoryMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<DomaineCategory> getAll() {
        List<Category> categories = repository.findAll();
        return mapper.toDomainList(categories);
    }

    @Override
    public DomaineCategory save(DomaineCategory category) {
        Category jpaCategory = repository.save(mapper.toJpa(category));
        return mapper.toDomain(jpaCategory);
    }

    @Override
    public DomaineCategory getById(Long id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElseThrow(()->new RuntimeException("Category Not found"));
    }

    @Override
    public DomaineCategory update(Long id, DomaineCategory category) {
        Category existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
        existing.setName(category.getName());
        existing.setImage(category.getImage());
        Category saved = repository.save(existing);

        return mapper.toDomain(saved);
    }
}
