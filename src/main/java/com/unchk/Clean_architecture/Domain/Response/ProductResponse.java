package com.unchk.Clean_architecture.Domain.Response;

import com.unchk.Clean_architecture.Domain.Entity.DomaineCategory;
import com.unchk.Clean_architecture.Domain.Entity.Panier;

import java.util.List;

public class ProductResponse {
    private  String name;
    private  String description;
    private  String image;
    private Float price;
    private Integer stock;
    private DomaineCategory domaineCategory;
    private List<Panier> paniers;

    public ProductResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public DomaineCategory getDomaineCategory() {
        return domaineCategory;
    }

    public void setDomaineCategory(DomaineCategory domaineCategory) {
        this.domaineCategory = domaineCategory;
    }

    public List<Panier> getPaniers() {
        return paniers;
    }

    public void setPaniers(List<Panier> paniers) {
        this.paniers = paniers;
    }
}
