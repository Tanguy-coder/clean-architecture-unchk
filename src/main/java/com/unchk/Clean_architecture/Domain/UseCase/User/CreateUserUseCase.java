package com.unchk.Clean_architecture.Domain.UseCase.User;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;
import com.unchk.Clean_architecture.Domain.Port.UserServiceInterface;

public class CreateUserUseCase implements CreateUserUseCaseInterface{
    private final UserServiceInterface service;

    public CreateUserUseCase(UserServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainUser execute(DomainUser user) {
        return this.service.save(user);
    }
}
