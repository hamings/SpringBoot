package com.example.cart.dto;

import com.example.cart.entity.Cart;
import lombok.Getter;

@Getter
public class CartResponseDTO {

    private Long cartId;

    private int amount;

    private Long proId;

    private String image;

    private String color;

    private String intro;

    private String contents;

    private String size;

    private int price;

    public CartResponseDTO(Cart cart){
        this.cartId = cart.getId();
        this.amount = cart.getAmount();
        this.proId = cart.getProduct().getId();
        this.image = cart.getProduct().getImage();
        this.color = cart.getProduct().getColor();
        this.contents = cart.getProduct().getContents();
        this.size = cart.getProduct().getSize();
        this.price = cart.getProduct().getPrice();
    }


}
