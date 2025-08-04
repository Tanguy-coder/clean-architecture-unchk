package com.unchk.Clean_architecture.Domain.Entity;

import com.unchk.Clean_architecture.Domain.Enum.TypeUser;

public class DomainUser extends AbstractEntity{
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private TypeUser type;

    public DomainUser() {
    }

    public DomainUser(String nom, String prenom, String email, String password, TypeUser type) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TypeUser getType() {
        return type;
    }

    public void setType(TypeUser type) {
        this.type = type;
    }
}
