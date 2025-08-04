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
public class Panier extends AbstractModel{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
//    @ManyToMany(mappedBy = "paniers")
////    @JoinTable(
////            name = "panier_product",
////            joinColumns = @JoinColumn(name = "panier_id"),
////            inverseJoinColumns = @JoinColumn(name = "product_id")
////    )
//    private List<Product> products;

    @OneToMany(mappedBy = "panier")
    private List<PanierProduct> panierProduct;
    private Integer qty;

}
