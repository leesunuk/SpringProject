package com.study.study;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date; //자동으로 timestamp로 매핑됨

@Entity
public class announcement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String 글제목;
    public LocalDate 날짜;
}
