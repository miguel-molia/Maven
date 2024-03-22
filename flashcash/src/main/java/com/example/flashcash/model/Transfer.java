package com.example.flashcash.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.time.LocalTime;

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
