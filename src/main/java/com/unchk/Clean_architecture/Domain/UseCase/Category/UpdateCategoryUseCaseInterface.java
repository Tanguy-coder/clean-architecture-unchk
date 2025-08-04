package com.unchk.Clean_architecture.Domain.UseCase.Category;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;

public interface UpdateCategoryUseCaseInterface {
    public DomaineCategory execute(Long id, DomaineCategory category);
}
