package com.kodilla.ecommercee;


import com.kodilla.ecommercee.domain.CartItemDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CartItemController {

    @RequestMapping(method = RequestMethod.GET, value = "getCartItems")
    public List<CartItemDto> getCartItems() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getCartItem")
    public CartItemDto getCartItem(Long id) {
        return new CartItemDto(1L, 1L, "TV", LocalDate.now(),
                10L, LocalDate.now());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteCartItem")
    public void deleteCartItem(Long id) {
        System.out.println("CartItem has been deleted");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateCartItem")
    public CartItemDto updateCartItem(CartItemDto cartItemDto) {
        return new CartItemDto(2L, 2L, "TV - UPDATE", LocalDate.now(),
                10L, LocalDate.now());

    }

    @RequestMapping(method = RequestMethod.POST, value = "createCartItem")
    public void createCartItem(CartItemDto cartItemDto) {
        System.out.println("CartItem was created");
    }

}