package com.ecommerce.cartservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Cart {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate date;
    private String name;
    private Long itemId;
    private String itemName;
    private String itemDescription;
    private Double price;
}


