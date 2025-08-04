package com.unchk.Clean_architecture.Infrastructure.Mapper;


import com.unchk.Clean_architecture.Domain.Entity.DomainUser;
import com.unchk.Clean_architecture.Infrastructure.Models.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toJpa(DomainUser product);
    DomainUser toDomain(User product);
    List<User> toJpaList(List<DomainUser> products);
    List<DomainUser> toDomainList(List<User> products);
}
