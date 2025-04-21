package com.study.study;

import jakarta.persistence.*;
import lombok.ToString;

@ToString
@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(length = 1000)
    public String title;
    public int price;

}


