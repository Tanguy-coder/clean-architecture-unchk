package com.unchk.Clean_architecture.Domain.Entity;



import java.util.List;

public class Panier extends AbstractEntity{
    private DomainUser user;
    private List<DomainProduct> products;
    private Integer qty;

    public Panier() {
    }

    public Panier(DomainUser user, List<DomainProduct> products, Integer qty) {
        this.user = user;
        this.products = products;
        this.qty = qty;
    }

    public DomainUser getUser() {
        return user;
    }

    public void setUser(DomainUser user) {
        this.user = user;
    }

    public List<DomainProduct> getProducts() {
        return products;
    }

    public void setProducts(List<DomainProduct> products) {
        this.products = products;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
