package com.unchk.Clean_architecture.Domain.Presenter;



import com.unchk.Clean_architecture.Domain.Entity.DomainProduct;
import com.unchk.Clean_architecture.Domain.Response.ProductResponse;

import java.util.List;

public interface ProductPresenterInterface {
    public ProductResponse present(DomainProduct product);
    public List<ProductResponse> presentList(List<DomainProduct> products);
}
