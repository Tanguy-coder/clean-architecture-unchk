package com.unchk.Clean_architecture.Infrastructure.Models;

import com.unchk.Clean_architecture.Domain.Enum.TypeUser;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends AbstractModel{

    private String nom;
    private String prenom;
    private String email;
    private String password;
    private TypeUser type;
    @OneToMany(mappedBy = "user")
    private List<Panier> panier;


}
