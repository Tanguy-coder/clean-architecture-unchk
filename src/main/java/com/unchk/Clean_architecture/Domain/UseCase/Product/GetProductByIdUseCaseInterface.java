package com.unchk.Clean_architecture.Domain.UseCase.Product;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;

public interface GetProductByIdUseCaseInterface {
    DomainProduct execute(Long id);
}
