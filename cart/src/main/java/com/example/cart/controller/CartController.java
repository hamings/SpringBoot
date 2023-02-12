package com.example.cart.controller;

import com.example.cart.dto.CartAmountDTO;
import com.example.cart.dto.CartDeleteDTO;
import com.example.cart.dto.CartResponseDTO;
import com.example.cart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/cart")
    public List<CartResponseDTO> cartList(){
        return cartService.selectCart();
    }

    @DeleteMapping("/cart")
    public String deleteCart(CartDeleteDTO cartDeleteDTO){
        return cartService.deleteCart(cartDeleteDTO);
    }

    @PatchMapping("/cart/amount")
    public String amountCart(CartAmountDTO cartAmountDTO){
        return cartService.amountCart(cartAmountDTO);
    }

}
