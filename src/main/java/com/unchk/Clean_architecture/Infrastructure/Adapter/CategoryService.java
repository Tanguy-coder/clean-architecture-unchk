package com.unchk.Clean_architecture.Infrastructure.Adapter;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;
import com.unchk.Clean_architecture.Domain.Gateway.CategoryRepositoryInterface;
import com.unchk.Clean_architecture.Domain.Port.CategoryServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements CategoryServiceInterface {
    private final CategoryRepositoryInterface repository;

    public CategoryService(CategoryRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public List<DomaineCategory> getAll() {
        return this.repository.getAll();
    }

    @Override
    public DomaineCategory save(DomaineCategory category) {
        return this.repository.save(category);
    }

    @Override
    public DomaineCategory getById(Long id) {
        return this.repository.getById(id);
    }

    @Override
    public DomaineCategory update(Long id, DomaineCategory category) {
        return this.repository.update(id, category);
    }
}
