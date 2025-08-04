package com.unchk.Clean_architecture.Domain.UseCase.Product;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;
import com.unchk.Clean_architecture.Domain.Port.ProductServiceInterface;

import java.util.List;

public class ListProductUseCase implements ListProductUseCaseInterface{
    private final ProductServiceInterface service;

    public ListProductUseCase(ProductServiceInterface service) {
        this.service = service;
    }

    @Override
    public List<DomainProduct> execute() {
        return this.service.getAll();
    }
}
