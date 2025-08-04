package com.unchk.Clean_architecture.Infrastructure.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true) //comparaison entre deux objets
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "panier_product")
public class PanierProduct extends AbstractModel{

    @ManyToOne
    @JoinColumn(name = "panier_id")
    private  Panier panier;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private Integer qty;
}
