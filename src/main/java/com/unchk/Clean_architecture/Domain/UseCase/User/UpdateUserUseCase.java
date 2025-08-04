package com.unchk.Clean_architecture.Domain.UseCase.User;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;
import com.unchk.Clean_architecture.Domain.Port.UserServiceInterface;

public class UpdateUserUseCase implements UpdateUserUseCaseInterface{
    private final UserServiceInterface service;

    public UpdateUserUseCase(UserServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainUser execute(Long id, DomainUser user) {
        return this.service.update(id, user);
    }
}
