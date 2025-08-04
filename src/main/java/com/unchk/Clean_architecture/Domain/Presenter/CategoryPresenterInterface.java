package com.unchk.Clean_architecture.Domain.Presenter;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;
import com.unchk.Clean_architecture.Domain.Response.CategoryResponse;

import java.util.List;

public interface CategoryPresenterInterface {
    public CategoryResponse present(DomaineCategory category);
    public List<CategoryResponse> presentList(List<DomaineCategory> categories);
}
