package com.example.democomposite.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@Entity
@Data
public class Orders {
    @Id
    private long id;
    @OneToMany(mappedBy = "order")
    private Collection<OrderItem> orderItems;
}
