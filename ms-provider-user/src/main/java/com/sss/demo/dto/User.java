package com.sss.demo.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String name;
    private Integer age;

    private BigDecimal balance;
}
