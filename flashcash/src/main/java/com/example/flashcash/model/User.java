package com.example.flashcash.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer firstName;
    private Integer lastName;
    @Column(unique = true)
    private String email;
    private String password;
    //@ManyToMany
   // private List<Link> links;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private UserAccount account;

}
