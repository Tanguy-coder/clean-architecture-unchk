package com.unchk.Clean_architecture.Infrastructure.Repository;

import com.unchk.Clean_architecture.Infrastructure.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJPaRepository extends JpaRepository<Product, Long> {
}
