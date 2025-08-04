package com.unchk.Clean_architecture.Infrastructure.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends AbstractModel{

    private  String name;
    private  String description;
    private  String image;
    private Float price;
    private Integer stock;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
//    @ManyToMany(mappedBy = "products")
//    private List<Panier> paniers;
    @OneToMany(mappedBy = "product")
    private List<PanierProduct> panierProduct;
    @OneToMany(mappedBy = "product")
    private List<DetailsCommande> detailsCommandes;


}
