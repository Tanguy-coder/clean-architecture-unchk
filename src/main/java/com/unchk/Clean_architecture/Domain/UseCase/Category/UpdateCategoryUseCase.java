package com.unchk.Clean_architecture.Domain.UseCase.Category;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;
import com.unchk.Clean_architecture.Domain.Port.CategoryServiceInterface;

public class UpdateCategoryUseCase implements UpdateCategoryUseCaseInterface{
    private final CategoryServiceInterface service;

    public UpdateCategoryUseCase(CategoryServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomaineCategory execute(Long id, DomaineCategory category) {
        return this.service.update(id,category);
    }
}
