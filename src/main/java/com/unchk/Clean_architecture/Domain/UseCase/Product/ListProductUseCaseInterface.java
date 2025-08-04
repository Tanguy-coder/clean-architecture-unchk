package com.unchk.Clean_architecture.Domain.UseCase.Product;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;

import java.util.List;

public interface ListProductUseCaseInterface {
    List<DomainProduct> execute();
}
