package com.stone.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author stone
 * @date 2018/1/22 9:38
 */
@Getter@Setter@ToString
public class Product implements Serializable {

    private Long id;

    private String name;

    private BigDecimal price;

}
