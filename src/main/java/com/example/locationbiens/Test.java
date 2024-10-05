package com.example.locationbiens;

import jakarta.persistence.*;

@Entity
public class Test {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "cin")
    private Integer cin;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "adress")
    private String adress;
}
