package com.unchk.Clean_architecture.Domain.Entity;


import java.util.List;

public class DomaineCategory extends AbstractEntity{
    private  String name;
    private  String Image;
    private List<DomainProduct> products;

    public DomaineCategory() {
    }

    public DomaineCategory(String name, String image, List<DomainProduct> products) {
        this.name = name;
        Image = image;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public List<DomainProduct> getProducts() {
        return products;
    }

    public void setProducts(List<DomainProduct> products) {
        this.products = products;
    }
}
