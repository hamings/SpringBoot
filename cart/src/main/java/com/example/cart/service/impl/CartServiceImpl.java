package com.example.cart.service.impl;

import com.example.cart.dto.CartAmountDTO;
import com.example.cart.dto.CartDeleteDTO;
import com.example.cart.dto.CartResponseDTO;
import com.example.cart.entity.Cart;
import com.example.cart.repository.CartRepository;
import com.example.cart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Override
    public List<CartResponseDTO> selectCart() {
        List<Cart> cartList = cartRepository.findAll();
        return cartList.stream()
                .map(entity->new CartResponseDTO(entity))
                .collect(Collectors.toList());
    }

    @Override
    public String deleteCart(CartDeleteDTO cartDeleteDTO) {
        try{
            cartRepository.delete(cartDeleteDTO.toEntity());
        }catch (Exception e){
            return "failed";
        }
        return "success";
    }

    @Override
    public String amountCart(CartAmountDTO cartAmountDTO) {

        Optional<Cart> cartOptional = cartRepository.findById(Long.valueOf(cartAmountDTO.getId()));
        try{
            Cart cartFound = cartOptional.get();
            if(cartAmountDTO.getAct().equals("plus")){
                cartFound.setAmount(cartFound.getAmount()+1);
                cartRepository.save(cartFound);
            }else{
                cartFound.setAmount(cartFound.getAmount()-1);
                cartRepository.save(cartFound);
            }
        }catch (Exception e){
            return "failed";
        }
        return "success";
    }
}
