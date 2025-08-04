package com.unchk.Clean_architecture.Infrastructure.Adapter;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;
import com.unchk.Clean_architecture.Domain.Gateway.UserRepositoryInterface;
import com.unchk.Clean_architecture.Domain.Port.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {
    private final UserRepositoryInterface repository;

    public UserService(UserRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public List<DomainUser> getAll() {
        return this.repository.getAll();
    }

    @Override
    public DomainUser save(DomainUser user) {
        return this.repository.save(user);
    }

    @Override
    public DomainUser getById(Long id) {
        return this.repository.getById(id);
    }

    @Override
    public DomainUser update(Long id, DomainUser user) {
        return this.repository.update(id,user);
    }
}
