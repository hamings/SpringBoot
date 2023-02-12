package com.example.cart.service;

import com.example.cart.dto.CartAmountDTO;
import com.example.cart.dto.CartDeleteDTO;
import com.example.cart.dto.CartResponseDTO;

import java.util.List;

public interface CartService {

    public List<CartResponseDTO> selectCart();

    public String deleteCart(CartDeleteDTO cartDeleteDTO);

    public String amountCart(CartAmountDTO cartAmountDTO);

}
