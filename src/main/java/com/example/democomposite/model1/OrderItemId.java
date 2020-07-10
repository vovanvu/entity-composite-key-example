package com.example.democomposite.model1;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor

public class OrderItemId implements Serializable {
    private Orders orders;
    private Product product;

}
