package com.ecommerce.cartservice.service.serviceImpl;

//import com.ecommerce.cartservice.entity.Cart;
import com.ecommerce.cartservice.entity.Cart;
import com.ecommerce.cartservice.model.CartRequest;
import com.ecommerce.cartservice.model.CartResponse;
import com.ecommerce.cartservice.repository.CartRepo;
import com.ecommerce.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepo cartRepo;

    @Override
    public CartResponse getItemById(Long id) {
        Optional<Cart> cart =  cartRepo.findById(id);

        CartResponse cartResponse = new CartResponse();
        if(cart.isPresent()) {
            cartResponse.setItemId(cart.get().getItemId());
            cartResponse.setItemName(cart.get().getItemName());
            cartResponse.setItemDescription(cart.get().getItemDescription());
        }
        return cartResponse;
    }

    @Override
    public CartResponse saveItem(CartRequest cartRequest) {

        System.out.println(cartRepo.getClass().getName());
        Cart cart = new Cart();
        cart.setItemId(cartRequest.getItemId());
        cart.setName(cartRequest.getItemName());
        cart.setItemDescription(cartRequest.getItemDescription());

        /*        Cart cart = cartRepo.save(cartRequest);
        CartResponse response  = CartResponse.builder().itemId(cart.getItemId())
                .itemName(cart.getItemName())
                .name(cart.getName())
                .itemDescription(cart.getItemDescription())
                .price(cart.getPrice()).build();
        return response;*/
        Cart cartReturn = cartRepo.save(cart);

        CartResponse cartResponse = new CartResponse();
        cartResponse.setItemId(cartReturn.getItemId());
        cartResponse.setItemName(cartReturn.getItemName());
        cartResponse.setItemDescription(cartReturn.getItemDescription());

        return cartResponse;
    }
}
