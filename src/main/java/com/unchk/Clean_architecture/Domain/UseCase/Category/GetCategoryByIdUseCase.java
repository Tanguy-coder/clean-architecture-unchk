package com.unchk.Clean_architecture.Domain.UseCase.Category;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;
import com.unchk.Clean_architecture.Domain.Port.CategoryServiceInterface;

public class GetCategoryByIdUseCase implements GetCategoryByIdUseCaseInterface{
    private final CategoryServiceInterface service;

    public GetCategoryByIdUseCase(CategoryServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomaineCategory execute(Long id) {
        return this.service.getById(id);
    }
}
