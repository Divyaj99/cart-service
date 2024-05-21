package com.ecommerce.cartservice.repository;

import com.ecommerce.cartservice.entity.Cart;

import com.ecommerce.cartservice.model.CartRequest;
import com.ecommerce.cartservice.model.CartResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CartRepo extends JpaRepository<CartRequest, Long> {
    CartResponse save(CartRequest cartRequest);

}
