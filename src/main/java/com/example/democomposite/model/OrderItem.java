package com.example.democomposite.model;

import lombok.Data;

import javax.persistence.*;

//@Entity
@Data
@IdClass(OrderItemId.class)
public class OrderItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;
    @Id
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private int quantity;
}
