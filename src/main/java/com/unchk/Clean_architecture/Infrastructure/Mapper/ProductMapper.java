package com.unchk.Clean_architecture.Infrastructure.Mapper;

import com.unchk.Clean_architecture.Infrastructure.Models.Product;
import org.mapstruct.Mapper;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toJpa(DomainProduct product);
    DomainProduct toDomain(Product product);
    List<Product> toJpaList(List<DomainProduct> products);
    List<DomainProduct> toDomainList(List<Product> products);
}
