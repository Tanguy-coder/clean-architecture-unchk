package com.unchk.Clean_architecture.Domain.UseCase.Category;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;

public interface CreateCategoryUseCaseInterface {
    public DomaineCategory execute(DomaineCategory category);
}
