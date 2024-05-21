package com.ecommerce.cartservice.service.serviceImpl;

//import com.ecommerce.cartservice.entity.Cart;
import com.ecommerce.cartservice.model.CartRequest;
import com.ecommerce.cartservice.model.CartResponse;
import com.ecommerce.cartservice.repository.CartRepo;
import com.ecommerce.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepo cartRepo;

    @Override
    public CartResponse getItemById() {
        return null;
    }

    @Override
    public CartResponse saveItem(CartRequest cartRequest) {

        System.out.println(cartRepo.getClass().getName());
        /*        Cart cart = cartRepo.save(cartRequest);
        CartResponse response  = CartResponse.builder().itemId(cart.getItemId())
                .itemName(cart.getItemName())
                .name(cart.getName())
                .itemDescription(cart.getItemDescription())
                .price(cart.getPrice()).build();
        return response;*/
        return cartRepo.save(cartRequest);
    }
}
