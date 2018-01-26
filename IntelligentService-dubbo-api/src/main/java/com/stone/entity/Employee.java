package com.stone.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author stone
 * @date 2018/1/25 15:46
        */
@Getter@Setter
public class Employee implements Serializable{

    private Long empId;

    private String empName;

    /**
     * many2one中,many方维护关系
     */
    private Department dept;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
