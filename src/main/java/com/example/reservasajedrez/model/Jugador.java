package com.example.reservasajedrez.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import io.swagger.v3.oas.annotations.media.Schema;

@Document(collection = "jugadors")
@Schema(description = "Entity representing a chess player in the system")
public class Jugador {

    @Id
    @Schema(
        description = "Unique identifier of the player",
        example = "65b2f3d9c12a"
    )
    private String id;

    @Field("nom_jugador")
    @Schema(
        description = "Full name of the player",
        example = "Magnus Carlsen"
    )
    private String nom;

    @Schema(
        description = "Age of the player",
        example = "30"
    )
    private String edat;

    @Schema(
        description = "Gender of the player",
        example = "Male"
    )
    private String sexe;

    @Schema(
        description = "Skill level of the player (Beginner, Intermediate, Advanced)",
        example = "Advanced"
    )
    private String nivell;

    @Schema(
        description = "Encrypted password of the player account",
        example = "$2a$10$EixZaYVK1fsbw1ZfbX3OXe",
        accessMode = Schema.AccessMode.WRITE_ONLY
    )
    private String password;

    @Schema(
        description = "Email address of the player",
        example = "player@example.com"
    )
    private String email;

    @Schema(
        description = "Role assigned to the player (e.g., USER or ADMIN)",
        example = "USER"
    )
    private Role role;

    public Jugador() {}

    public Jugador(String id, String nom, String edat, String sexe, String nivell, String password, String email) {
        super();
        this.id = id;
        this.nom = nom;
        this.edat = edat;
        this.sexe = sexe;
        this.nivell = nivell;
        this.password = password;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEdat() {
        return edat;
    }

    public void setEdat(String edat) {
        this.edat = edat;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNivell() {
        return nivell;
    }

    public void setNivell(String nivell) {
        this.nivell = nivell;
    }

    public String getPassword() {
        return password;
    }

    public void setPasword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
