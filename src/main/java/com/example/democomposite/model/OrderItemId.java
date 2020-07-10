package com.example.democomposite.model;

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
    private Orders order;
    private Product product;
}
