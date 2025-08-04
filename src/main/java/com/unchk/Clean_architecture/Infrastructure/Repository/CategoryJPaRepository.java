package com.unchk.Clean_architecture.Infrastructure.Repository;

import com.unchk.Clean_architecture.Infrastructure.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryJPaRepository extends JpaRepository< Category, Long> {
}
