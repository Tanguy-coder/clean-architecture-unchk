package com.unchk.Clean_architecture.Infrastructure.Controller;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;
import com.unchk.Clean_architecture.Domain.Response.UserResponse;
import com.unchk.Clean_architecture.Domain.UseCase.User.CreateUserUseCaseInterface;
import com.unchk.Clean_architecture.Domain.UseCase.User.GetUserByIdUseCaseInterface;
import com.unchk.Clean_architecture.Domain.UseCase.User.ListUserUseCaseInterface;
import com.unchk.Clean_architecture.Domain.UseCase.User.UpdateUserUseCaseInterface;
import com.unchk.Clean_architecture.Infrastructure.Presenter.UserPresenter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final CreateUserUseCaseInterface store;
    private final ListUserUseCaseInterface list;
    private final GetUserByIdUseCaseInterface show;
    private final UpdateUserUseCaseInterface update;
    private final UserPresenter presenter;

    public UserController(CreateUserUseCaseInterface store,
                          ListUserUseCaseInterface list,
                          GetUserByIdUseCaseInterface show,
                          UpdateUserUseCaseInterface update,
                          UserPresenter presenter) {
        this.store = store;
        this.list = list;
        this.show = show;
        this.update = update;
        this.presenter = presenter;
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>> index(){
        return ResponseEntity.ok(presenter.presentList(list.execute()));
    }

    @PostMapping
    public  ResponseEntity<UserResponse> store(@RequestBody DomainUser user){
        return ResponseEntity.ok(presenter.present(store.execute(user)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> show(@PathVariable Long id){
        return ResponseEntity.ok(presenter.present(show.execute(id)));
    }

    @PostMapping("/{id}")
    public ResponseEntity<UserResponse> update(@PathVariable Long id, @RequestBody DomainUser user){
        return ResponseEntity.ok(presenter.present(update.execute(id, user)));
    }
}
