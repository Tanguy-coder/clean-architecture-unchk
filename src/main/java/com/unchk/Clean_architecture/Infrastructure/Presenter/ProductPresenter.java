package com.unchk.Clean_architecture.Infrastructure.Presenter;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;
import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;
import com.unchk.Clean_architecture.Domain.Presenter.ProductPresenterInterface;
import com.unchk.Clean_architecture.Domain.Response.CategoryResponse;
import com.unchk.Clean_architecture.Domain.Response.ProductResponse;

import java.util.List;
import java.util.stream.Collectors;

public class ProductPresenter implements ProductPresenterInterface {
    @Override
    public ProductResponse present(DomainProduct product) {
        ProductResponse response = new ProductResponse();
        response.setName(product.getName());
        response.setImage(product.getImage());
        response.setPrice(product.getPrice());
        response.setStock(product.getStock());

        DomaineCategory category = new DomaineCategory();
        category.setId(product.getCategory().getId());

        response.setDomaineCategory(category);

        return response;
    }

    @Override
    public List<ProductResponse> presentList(List<DomainProduct> products) {
        return products.stream().map(this::present).collect(Collectors.toList());
    }
}
