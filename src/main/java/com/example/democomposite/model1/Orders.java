package com.example.democomposite.model1;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity



@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "orders")
    private Collection<OrderItem> orderItems;

    private Date orderDate;
    private String address;
    private String phoneNumber;
    private int status;
    private double totalPrice;
}
