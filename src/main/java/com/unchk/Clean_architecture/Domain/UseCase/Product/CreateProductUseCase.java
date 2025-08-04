package com.unchk.Clean_architecture.Domain.UseCase.Product;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;
import com.unchk.Clean_architecture.Domain.Port.ProductServiceInterface;

public class CreateProductUseCase implements CreateProductUseCaseInterface{
    private final ProductServiceInterface service;

    public CreateProductUseCase(ProductServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainProduct execute(DomainProduct product) {
        return this.service.save(product);
    }
}
