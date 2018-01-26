package com.stone.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Role implements Serializable{

	private static final long serialVersionUID = 1L;

	private String roleId;//角色ID
	
	private String roleName;//角色名字
	
	private String sn;//角色编码

	private List<Permission> permissionList = new ArrayList<>();

	/*@ManyToMany
	@JoinTable(name="role_perm",
			joinColumns = {@JoinColumn(name="role_Id",referencedColumnName = "roleId")},
			inverseJoinColumns = {@JoinColumn(name="permission_Id",referencedColumnName = "permissionId")})
	private List<Permission> permissionList = new ArrayList<>();*/
}
