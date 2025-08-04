package com.unchk.Clean_architecture.Domain.Port;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;

import java.util.List;

public interface ProductServiceInterface {
    List<DomainProduct> getAll();
    DomainProduct save(DomainProduct product);
    DomainProduct getById(Long id);
    DomainProduct update(Long id, DomainProduct product);
}
