package com.unchk.Clean_architecture.Infrastructure.Controller;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;
import com.unchk.Clean_architecture.Domain.Presenter.CategoryPresenterInterface;
import com.unchk.Clean_architecture.Domain.Response.CategoryResponse;
import com.unchk.Clean_architecture.Domain.UseCase.Category.CreateCategoryUseCaseInterface;
import com.unchk.Clean_architecture.Domain.UseCase.Category.GetCategoryByIdUseCaseInterface;
import com.unchk.Clean_architecture.Domain.UseCase.Category.ListCategoriesUseCaseInterface;

import java.util.List;

import com.unchk.Clean_architecture.Domain.UseCase.Category.UpdateCategoryUseCaseInterface;
import com.unchk.Clean_architecture.Infrastructure.Request.CategoryRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private final ListCategoriesUseCaseInterface getAll;
    private final CreateCategoryUseCaseInterface save;
    private final GetCategoryByIdUseCaseInterface getById;
    private final UpdateCategoryUseCaseInterface  update;
    private final CategoryPresenterInterface presenter;

    public CategoryController(ListCategoriesUseCaseInterface getAll, CreateCategoryUseCaseInterface save, GetCategoryByIdUseCaseInterface getById, UpdateCategoryUseCaseInterface update, CategoryPresenterInterface presenter) {
        this.getAll = getAll;
        this.save = save;
        this.getById = getById;
        this.update = update;
        this.presenter = presenter;
    }

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> index() {
        return ResponseEntity.ok(presenter.presentList(getAll.execute()));
    }

    @PostMapping
    public ResponseEntity<CategoryResponse> create(@RequestBody DomaineCategory category){
        return ResponseEntity.ok(presenter.present(save.execute(category)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponse> show(@PathVariable Long id){
        return ResponseEntity.ok(presenter.present(getById.execute(id)));
    }

    @PostMapping("/{id}")
    public ResponseEntity<CategoryResponse> update(@PathVariable Long id, @RequestBody DomaineCategory category){
        return ResponseEntity.ok(presenter.present(update.execute(id,category)));
    }
}
