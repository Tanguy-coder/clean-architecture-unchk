package com.unchk.Clean_architecture.Domain.UseCase.Product;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;

public interface UpdateProductUseCaseInterface {
    DomainProduct execute(Long id, DomainProduct product);
}
