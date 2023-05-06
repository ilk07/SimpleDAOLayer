package com.homeworks.twotableswithhibernate.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;


@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(nullable = false, columnDefinition = "0.00")
    private double amount;


}
