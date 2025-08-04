package com.unchk.Clean_architecture.Domain.UseCase.User;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;
import com.unchk.Clean_architecture.Domain.Port.UserServiceInterface;

public class GetUserByIdUseCase implements GetUserByIdUseCaseInterface{
    private final UserServiceInterface service;

    public GetUserByIdUseCase(UserServiceInterface service) {
        this.service = service;
    }

    @Override
    public DomainUser execute(Long id) {
        return service.getById(id);
    }
}
