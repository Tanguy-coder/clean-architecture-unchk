package com.unchk.Clean_architecture.Domain.UseCase.Product;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;
import com.unchk.Clean_architecture.Domain.Port.ProductServiceInterface;

public class UpdateProductUseCase implements UpdateProductUseCaseInterface{
    private final ProductServiceInterface service;

    public UpdateProductUseCase(ProductServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainProduct execute(Long id, DomainProduct product) {
        return this.service.update(id, product);
    }
}
