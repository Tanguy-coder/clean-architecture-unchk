package com.unchk.Clean_architecture.Domain.Presenter;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;
import com.unchk.Clean_architecture.Domain.Response.UserResponse;

import java.util.List;

public interface UserPresenterInterface {
    public UserResponse present(DomainUser user);
    public List<UserResponse> presentList(List<DomainUser> users);
}
