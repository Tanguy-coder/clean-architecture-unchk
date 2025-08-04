package com.unchk.Clean_architecture.Infrastructure.Repository;

import com.unchk.Clean_architecture.Infrastructure.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPaRepository extends JpaRepository<User,Long> {
}
