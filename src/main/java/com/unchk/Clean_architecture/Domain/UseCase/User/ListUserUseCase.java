package com.unchk.Clean_architecture.Domain.UseCase.User;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;
import com.unchk.Clean_architecture.Domain.Port.UserServiceInterface;

import java.util.List;

public class ListUserUseCase implements ListUserUseCaseInterface{
    private final UserServiceInterface service;

    public ListUserUseCase(UserServiceInterface service) {
        this.service = service;
    }

    @Override
    public List<DomainUser> execute() {
        return this.service.getAll();
    }
}
