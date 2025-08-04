package com.unchk.Clean_architecture.Infrastructure.Repository;

import com.unchk.Clean_architecture.Domain.Entity.DomainUser;
import com.unchk.Clean_architecture.Domain.Gateway.UserRepositoryInterface;
import com.unchk.Clean_architecture.Infrastructure.Mapper.UserMapper;
import com.unchk.Clean_architecture.Infrastructure.Models.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository implements UserRepositoryInterface {
    private final UserJPaRepository repository;
    private final UserMapper mapper;

    public UserRepository(UserJPaRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<DomainUser> getAll() {
        List<User> users = repository.findAll();
        return mapper.toDomainList(users);
    }

    @Override
    public DomainUser save(DomainUser user) {
        User jpaUser = repository.save(mapper.toJpa(user));
        return mapper.toDomain(jpaUser);
    }

    @Override
    public DomainUser getById(Long id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElseThrow(()->new RuntimeException("Not Found"));
    }

    @Override
    public DomainUser update(Long id, DomainUser user) {
        User userToEdit = repository.findById(id).orElseThrow();

        userToEdit.setEmail(user.getEmail());
        userToEdit.setNom(user.getNom());
        userToEdit.setPrenom(user.getPrenom());
        userToEdit.setPassword(user.getPassword());
        userToEdit.setType(user.getType());

        User editedUser = repository.save(userToEdit);

        return mapper.toDomain(editedUser);
    }
}
