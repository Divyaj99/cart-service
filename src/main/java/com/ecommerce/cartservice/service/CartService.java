package com.ecommerce.cartservice.service;

import com.ecommerce.cartservice.model.CartRequest;
import com.ecommerce.cartservice.model.CartResponse;

public interface CartService {
    CartResponse getItemById();
    CartResponse saveItem(CartRequest cartRequest);

}
