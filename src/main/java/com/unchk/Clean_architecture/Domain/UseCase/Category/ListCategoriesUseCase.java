package com.unchk.Clean_architecture.Domain.UseCase.Category;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;
import com.unchk.Clean_architecture.Domain.Port.CategoryServiceInterface;

import java.util.List;

public class ListCategoriesUseCase implements ListCategoriesUseCaseInterface{
    private final CategoryServiceInterface service;

    public ListCategoriesUseCase(CategoryServiceInterface service) {
        this.service = service;
    }

    @Override
    public List<DomaineCategory> execute() {
        return this.service.getAll();
    }
}
