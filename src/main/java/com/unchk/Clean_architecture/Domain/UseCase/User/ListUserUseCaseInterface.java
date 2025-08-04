package com.unchk.Clean_architecture.Domain.UseCase.User;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;

import java.util.List;

public interface ListUserUseCaseInterface {
    List<DomainUser> execute();
}
