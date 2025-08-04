package com.unchk.Clean_architecture.Infrastructure.Models;

import com.unchk.Clean_architecture.Domain.Enum.CommandStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Commande extends AbstractModel{
    private String numero;
    private Date date_comande;
    private Integer qty;
    private CommandStatus status;
    @OneToMany(mappedBy = "commande")
    private List<DetailsCommande> detailsCommandes;

}
