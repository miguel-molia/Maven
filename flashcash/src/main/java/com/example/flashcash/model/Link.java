package com.example.flashcash.model;

import jakarta.persistence.*;

@Entity
public class Link {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer id;
@ManyToOne
User user1;
@ManyToOne
User user2;
}
