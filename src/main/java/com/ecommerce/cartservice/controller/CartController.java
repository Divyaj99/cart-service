package com.ecommerce.cartservice.controller;

import com.ecommerce.cartservice.model.CartRequest;
import com.ecommerce.cartservice.model.CartResponse;
import com.ecommerce.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/{itemId}")
    private CartResponse getItemById(@PathVariable Long itemId) {
        return cartService.getItemById();
    }

    @PostMapping
    private CartResponse saveItem(@RequestBody CartRequest request) {
        System.out.println(cartService.getClass().getName());
        return cartService.saveItem(request);
    }
}
