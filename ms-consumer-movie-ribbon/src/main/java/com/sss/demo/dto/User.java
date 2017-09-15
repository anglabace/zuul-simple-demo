package com.sss.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class User {

    private Long id;

    private String username;
    private String name;
    private Integer age;

    private BigDecimal balance;
}
