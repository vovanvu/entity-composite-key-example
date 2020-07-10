package com.example.democomposite.model1;


import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity

@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    private Collection<Orders> orders;

}
