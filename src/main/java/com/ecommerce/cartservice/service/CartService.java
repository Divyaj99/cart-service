package com.ecommerce.cartservice.service;

import com.ecommerce.cartservice.entity.Cart;
import com.ecommerce.cartservice.model.CartRequest;
import com.ecommerce.cartservice.model.CartResponse;

import java.util.Optional;

public interface CartService {
    CartResponse getItemById(Long id);
    CartResponse saveItem(CartRequest cartRequest);
}
