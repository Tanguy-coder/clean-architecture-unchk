package com.unchk.Clean_architecture.Domain.Gateway;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;

import java.util.List;

public interface UserRepositoryInterface {
    List<DomainUser> getAll();
    DomainUser save(DomainUser user);
    DomainUser getById(Long id);
    DomainUser update(Long id,DomainUser user);
}
