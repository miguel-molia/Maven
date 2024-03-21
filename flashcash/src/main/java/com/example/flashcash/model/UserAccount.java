package com.example.flashcash.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;

@Entity
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    private Double amount;
    private String iban;


    public UserAccount plus(double amount) {

        this.amount += amount;
        return this;

    }

    public UserAccount minus(double amount) {

        this.amount -= amount;
        return this;
    }

}
