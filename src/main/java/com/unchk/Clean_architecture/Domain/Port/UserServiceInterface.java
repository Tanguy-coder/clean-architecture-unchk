package com.unchk.Clean_architecture.Domain.Port;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;

import java.util.List;

public interface UserServiceInterface {
    List<DomainUser> getAll();
    DomainUser save(DomainUser user);
    DomainUser getById(Long id);
    DomainUser update(Long id,DomainUser user);
}
