package com.example.flashcash.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
public class Transfer {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private LocalDateTime date;
@ManyToOne
private User from;
@ManyToOne
private User to;
private Double amountBeforeFee;
private Double amountAfterFee;
}
