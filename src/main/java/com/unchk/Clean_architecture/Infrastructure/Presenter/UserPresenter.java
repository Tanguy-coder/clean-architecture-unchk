package com.unchk.Clean_architecture.Infrastructure.Presenter;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;
import com.unchk.Clean_architecture.Domain.Presenter.UserPresenterInterface;
import com.unchk.Clean_architecture.Domain.Response.UserResponse;

import java.util.List;
import java.util.stream.Collectors;

public class UserPresenter implements UserPresenterInterface {
    @Override
    public UserResponse present(DomainUser user) {
        UserResponse response = new UserResponse();
        response.setNom(user.getNom());
        response.setEmail(user.getEmail());
        response.setPrenom(user.getPrenom());
        response.setPassword(user.getPassword());
        response.setType(user.getType());
        return response;
    }

    @Override
    public List<UserResponse> presentList(List<DomainUser> users) {
        return users.stream().map(this::present).collect(Collectors.toList());
    }
}
