package com.stone.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author stone
 * @date 2018/1/25 15:47
 */
@Getter@Setter@ToString
public class Department implements Serializable {

    private Long deptId;

    private String deptName;
}
