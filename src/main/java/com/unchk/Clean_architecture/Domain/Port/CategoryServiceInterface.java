package com.unchk.Clean_architecture.Domain.Port;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;

import java.util.List;

public interface CategoryServiceInterface {
    List<DomaineCategory> getAll();
    DomaineCategory save(DomaineCategory category);
    DomaineCategory getById(Long id);
    DomaineCategory update(Long id, DomaineCategory category);
}
