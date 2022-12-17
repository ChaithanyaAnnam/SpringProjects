package com.java.entity;
import lombok.*;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer tier;
}