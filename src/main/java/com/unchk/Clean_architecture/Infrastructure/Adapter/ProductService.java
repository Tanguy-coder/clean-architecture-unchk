package com.unchk.Clean_architecture.Infrastructure.Adapter;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;
import com.unchk.Clean_architecture.Domain.Gateway.ProductRepositoryInterface;
import com.unchk.Clean_architecture.Domain.Port.ProductServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductServiceInterface {
    private final ProductRepositoryInterface repository;

    public ProductService(ProductRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public List<DomainProduct> getAll() {
        return this.repository.getAll();
    }

    @Override
    public DomainProduct save(DomainProduct product) {
        return this.repository.save(product);
    }

    @Override
    public DomainProduct getById(Long id) {
        return this.repository.getById(id);
    }

    @Override
    public DomainProduct update(Long id, DomainProduct product) {
        return repository.update(id, product);
    }
}
