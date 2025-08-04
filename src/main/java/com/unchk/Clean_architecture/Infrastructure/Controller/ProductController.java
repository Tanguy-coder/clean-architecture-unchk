package com.unchk.Clean_architecture.Infrastructure.Controller;

import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;
import com.unchk.Clean_architecture.Domain.Presenter.ProductPresenterInterface;
import com.unchk.Clean_architecture.Domain.Response.ProductResponse;
import com.unchk.Clean_architecture.Domain.UseCase.Product.CreateProductUseCaseInterface;
import com.unchk.Clean_architecture.Domain.UseCase.Product.GetProductByIdUseCaseInterface;
import com.unchk.Clean_architecture.Domain.UseCase.Product.ListProductUseCaseInterface;
import com.unchk.Clean_architecture.Domain.UseCase.Product.UpdateProductUseCaseInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ListProductUseCaseInterface getAll;
    private final CreateProductUseCaseInterface save;
    private final GetProductByIdUseCaseInterface getById;
    private final UpdateProductUseCaseInterface update;
    private final ProductPresenterInterface presenter;

    public ProductController(ListProductUseCaseInterface getAll, CreateProductUseCaseInterface save, GetProductByIdUseCaseInterface getById, UpdateProductUseCaseInterface update, ProductPresenterInterface presenter) {
        this.getAll = getAll;
        this.save = save;
        this.getById = getById;
        this.update = update;
        this.presenter = presenter;
    }

    @GetMapping
    public ResponseEntity <List<ProductResponse>> index(){
        return ResponseEntity.ok(presenter.presentList(getAll.execute()));
    }

    @PostMapping
    public ResponseEntity<ProductResponse> store(@RequestBody DomainProduct product){
        return ResponseEntity.ok(presenter.present(save.execute(product)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> show(@PathVariable Long id){
        return ResponseEntity.ok(presenter.present(getById.execute(id)));
    }

    @PostMapping("/{id}")
    public ResponseEntity<ProductResponse> update(@PathVariable Long id,@RequestBody DomainProduct product){
        return ResponseEntity.ok(presenter.present(update.execute(id, product)));
    }
    
}
