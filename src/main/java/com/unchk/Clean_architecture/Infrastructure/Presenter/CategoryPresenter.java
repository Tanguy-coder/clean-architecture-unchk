package com.unchk.Clean_architecture.Infrastructure.Presenter;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;
import com.unchk.Clean_architecture.Domain.Presenter.CategoryPresenterInterface;
import com.unchk.Clean_architecture.Domain.Response.CategoryResponse;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryPresenter implements CategoryPresenterInterface {
    @Override
    public CategoryResponse present(DomaineCategory category) {
        CategoryResponse response = new CategoryResponse();
        response.setName(category.getName());
        response.setImage(category.getImage());
        return response;
    }

    @Override
    public List<CategoryResponse> presentList(List<DomaineCategory> categories) {
        return categories.stream().map(this::present).collect(Collectors.toList());
    }

}
