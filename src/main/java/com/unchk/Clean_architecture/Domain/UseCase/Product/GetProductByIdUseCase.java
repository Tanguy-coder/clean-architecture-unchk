package com.unchk.Clean_architecture.Domain.UseCase.Product;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;
import com.unchk.Clean_architecture.Domain.Port.ProductServiceInterface;

public class GetProductByIdUseCase implements GetProductByIdUseCaseInterface{
    private final ProductServiceInterface service;

    public GetProductByIdUseCase(ProductServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainProduct execute(Long id) {
        return this.service.getById(id);
    }
}
