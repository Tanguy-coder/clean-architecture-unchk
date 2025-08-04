package com.unchk.Clean_architecture;

import com.unchk.Clean_architecture.Domain.Port.CategoryServiceInterface;
import com.unchk.Clean_architecture.Domain.Port.ProductServiceInterface;
import com.unchk.Clean_architecture.Domain.UseCase.Category.CreateCategoryUseCase;
import com.unchk.Clean_architecture.Domain.UseCase.Category.GetCategoryByIdUseCase;
import com.unchk.Clean_architecture.Domain.UseCase.Category.ListCategoriesUseCase;
import com.unchk.Clean_architecture.Domain.UseCase.Category.UpdateCategoryUseCase;
import com.unchk.Clean_architecture.Domain.UseCase.Product.CreateProductUseCase;
import com.unchk.Clean_architecture.Domain.UseCase.Product.GetProductByIdUseCase;
import com.unchk.Clean_architecture.Domain.UseCase.Product.ListProductUseCase;
import com.unchk.Clean_architecture.Domain.UseCase.Product.UpdateProductUseCase;
import com.unchk.Clean_architecture.Infrastructure.Presenter.CategoryPresenter;
import com.unchk.Clean_architecture.Infrastructure.Presenter.ProductPresenter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CleanArchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanArchitectureApplication.class, args);
	}

	@Bean
	public CategoryPresenter categoryPresenter(){
		return new CategoryPresenter();
	}

	@Bean
	public ProductPresenter productPresenter(){
		return new ProductPresenter();
	}

	/*******************************UseCases*********************************************************/
	@Bean
	public ListCategoriesUseCase listCategoriesUseCase(CategoryServiceInterface categoryServiceInterface){
		return new ListCategoriesUseCase(categoryServiceInterface);
	}

	@Bean
	public CreateCategoryUseCase createCategoryUseCase(CategoryServiceInterface categoryServiceInterface){
		return new CreateCategoryUseCase(categoryServiceInterface);
	}

	@Bean
	public GetCategoryByIdUseCase getCategoryByIdUseCase(CategoryServiceInterface categoryServiceInterface){
		return new GetCategoryByIdUseCase(categoryServiceInterface);
	}

	@Bean
	public UpdateCategoryUseCase updateCategoryUseCase(CategoryServiceInterface categoryServiceInterface){
		return new UpdateCategoryUseCase(categoryServiceInterface);
	}	

	@Bean
	public ListProductUseCase listProductUseCase(ProductServiceInterface productServiceInterface){
		return new ListProductUseCase(productServiceInterface);
	}
	@Bean
	public CreateProductUseCase createProductUseCase(ProductServiceInterface productServiceInterface){
		return new CreateProductUseCase(productServiceInterface);
	}
	@Bean
	public GetProductByIdUseCase getProductByIdUseCase(ProductServiceInterface productServiceInterface){
		return new GetProductByIdUseCase(productServiceInterface);
	}
	@Bean
	public UpdateProductUseCase updateProductUseCase(ProductServiceInterface productServiceInterface){
		return new UpdateProductUseCase(productServiceInterface);
	}
	

}
