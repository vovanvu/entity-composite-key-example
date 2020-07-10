package com.example.democomposite.model1;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity

@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductType productType;
    private double price;
    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Producer producer;
    private int stock;
    private String image;
    private  String description;
    private Date addedDate;


}
