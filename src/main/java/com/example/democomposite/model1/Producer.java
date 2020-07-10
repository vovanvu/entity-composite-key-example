package com.example.democomposite.model1;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity

@Data
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameProducer;
    private String address;
    private String phoneNumber;
    private String email;
    @OneToMany(mappedBy = "producer")
    private Collection<Product> products;
}
