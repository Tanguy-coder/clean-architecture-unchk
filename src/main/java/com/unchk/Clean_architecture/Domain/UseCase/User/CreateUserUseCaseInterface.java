package com.unchk.Clean_architecture.Domain.UseCase.User;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;

public interface CreateUserUseCaseInterface {
    DomainUser execute(DomainUser user);
}
