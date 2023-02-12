package com.example.cart.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "prac_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "intro")
    private String intro;

    @Column(name = "contents")
    private String contents;

    @Column(name = "price")
    private int price;

    @Column(name = "image")
    private String image;

    @Column(name = "size")
    private String size;

    @Column(name = "color")
    private String color;


}
