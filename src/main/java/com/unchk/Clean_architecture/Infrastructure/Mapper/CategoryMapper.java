package com.unchk.Clean_architecture.Infrastructure.Mapper;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;
import com.unchk.Clean_architecture.Infrastructure.Models.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category toJpa(DomaineCategory category);
    DomaineCategory toDomain(Category category);
    List<Category> toJpaList(List<DomaineCategory> categories);
    List<DomaineCategory> toDomainList(List<Category> categories);
}
