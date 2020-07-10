package com.example.democomposite.model1;


import lombok.*;

import javax.persistence.*;

@Entity

@Data
@IdClass(OrderItemId.class)
public class OrderItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;
    @Id
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private int quantity;


}