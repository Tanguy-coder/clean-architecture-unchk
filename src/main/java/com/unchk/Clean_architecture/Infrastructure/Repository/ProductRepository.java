package com.unchk.Clean_architecture.Infrastructure.Repository;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;
import com.unchk.Clean_architecture.Domain.Gateway.ProductRepositoryInterface;
import com.unchk.Clean_architecture.Infrastructure.Mapper.ProductMapper;
import com.unchk.Clean_architecture.Infrastructure.Models.Category;
import com.unchk.Clean_architecture.Infrastructure.Models.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository implements ProductRepositoryInterface {
    private final ProductJPaRepository repository;
    private final ProductMapper mapper;

    public ProductRepository(ProductJPaRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<DomainProduct> getAll() {
        List<Product> products = repository.findAll();
        return mapper.toDomainList(products);
    }

    @Override
    public DomainProduct save(DomainProduct product) {
        Product jpaProduct = repository.save(mapper.toJpa(product));
        return mapper.toDomain(jpaProduct);
    }

    @Override
    public DomainProduct getById(Long id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElseThrow(()->new RuntimeException("Not Found"));
    }

    @Override
    public DomainProduct update(Long id, DomainProduct product) {
        Product existing = repository.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
        existing.setName(product.getName());
        existing.setImage(product.getImage());
        existing.setPrice(product.getPrice());
        existing.setDescription(product.getDescription());

        Category category = repository.findById(product.getCategory().getId()).
                orElseThrow().getCategory();
        existing.setCategory(category);

        Product updated = repository.save(existing);

        return mapper.toDomain(updated);
    }
}
