package com.example.democomposite.model1;


import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity

@Data
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "productType")
    private Collection<Product> products;
}
