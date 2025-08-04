package com.unchk.Clean_architecture.Domain.Entity;



import java.util.List;

public class DomainProduct extends AbstractEntity{
    private  String name;
    private  String description;
    private  String image;
    private Float price;
    private Integer stock;
    private DomaineCategory domaineCategory;
    private List<Panier> paniers;

    public DomainProduct() {
    }

    public DomainProduct(String name, String description, String image, Float price, Integer stock, DomaineCategory domaineCategory, List<Panier> paniers) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.stock = stock;
        this.domaineCategory = domaineCategory;
        this.paniers = paniers;
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

    public DomaineCategory getCategory() {
        return domaineCategory;
    }

    public void setCategory(DomaineCategory domaineCategory) {
        this.domaineCategory = domaineCategory;
    }

    public List<Panier> getPaniers() {
        return paniers;
    }

    public void setPaniers(List<Panier> paniers) {
        this.paniers = paniers;
    }
}
