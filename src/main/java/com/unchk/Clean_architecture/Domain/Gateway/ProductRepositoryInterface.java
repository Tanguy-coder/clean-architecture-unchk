package com.unchk.Clean_architecture.Domain.Gateway;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;

import java.util.List;

public interface ProductRepositoryInterface {
    List<DomainProduct> getAll();
    DomainProduct save(DomainProduct product);
    DomainProduct getById(Long id);
    DomainProduct update(Long id, DomainProduct product);
}
