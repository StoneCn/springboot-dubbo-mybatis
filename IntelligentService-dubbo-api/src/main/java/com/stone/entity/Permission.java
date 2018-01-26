package com.stone.entity;

import java.io.Serializable;

public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

	private String permissionId;
	
	private String name;//权限名称
	
	private String expression;//权限表达式
	
}