package com.unchk.Clean_architecture.Domain.UseCase.Category;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;
import com.unchk.Clean_architecture.Domain.Port.CategoryServiceInterface;

public class CreateCategoryUseCase implements CreateCategoryUseCaseInterface{
    private final CategoryServiceInterface service;

    public CreateCategoryUseCase(CategoryServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomaineCategory execute(DomaineCategory category) {
        return this.service.save(category);
    }
}
