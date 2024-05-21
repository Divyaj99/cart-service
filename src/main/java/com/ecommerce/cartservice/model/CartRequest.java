package com.ecommerce.cartservice.model;

import com.ecommerce.cartservice.entity.Cart;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CartRequest {
    @Id
    @GeneratedValue
    private Long itemId;
    private String itemName;
    private String itemDescription;
    private Double price;
    private LocalDate date;
    private String name;

}
