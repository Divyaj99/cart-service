package com.ecommerce.cartservice.controller;

import com.ecommerce.cartservice.entity.Cart;
import com.ecommerce.cartservice.model.CartRequest;
import com.ecommerce.cartservice.model.CartResponse;
import com.ecommerce.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/{itemId}")
    //@ResponseStatus(HttpStatus.BAD_GATEWAY)
    private ResponseEntity<CartResponse> getItemById(@PathVariable Long itemId) {
        return new ResponseEntity<>(cartService.getItemById(itemId), HttpStatusCode.valueOf(200));
    }

    @PostMapping
    private CartResponse saveItem(@RequestBody CartRequest request) {
        System.out.println(cartService.getClass().getName());

        return cartService.saveItem(request);
    }
}
