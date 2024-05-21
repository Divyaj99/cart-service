package com.ecommerce.cartservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartResponse {

    private LocalDate date;
    private String name;
    private Long itemId;
    private String itemName;
    private String itemDescription;
    private Double price;

}
