package com.unchk.Clean_architecture.Domain.UseCase.Category;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;

import java.util.List;

public interface ListCategoriesUseCaseInterface {
    public List<DomaineCategory> execute();
}
