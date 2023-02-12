package com.example.cart.dto;

import com.example.cart.entity.Cart;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartDeleteDTO {

    private int id;

    public Cart toEntity(){
        return Cart.builder()
                .id(Long.valueOf(id))
                .build();
    }
}
