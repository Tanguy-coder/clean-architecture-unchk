package com.unchk.Clean_architecture.Domain.Gateway;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;

import java.util.List;

public interface CategoryRepositoryInterface {
    public List<DomaineCategory> getAll();
    public DomaineCategory save(DomaineCategory category);
    public DomaineCategory getById(Long id);
    DomaineCategory update(Long id, DomaineCategory category);
}
