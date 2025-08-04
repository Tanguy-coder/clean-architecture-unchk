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
public class Category extends AbstractModel{

    private  String name;
    private  String Image;
    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    private List<Product> products;

}
