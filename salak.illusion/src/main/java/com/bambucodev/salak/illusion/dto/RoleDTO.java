package com.bambucodev.salak.illusion.dto;
// Generated 29/05/2016 09:49:36 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.ArrayList;
import java.util.List;

/**
 * Role generated by hbm2java
 */
public class RoleDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6789268300850921114L;
	private int idRole;
	private String name;
	private boolean state;
	private String description;
	private RoleOptionDTO roleOption;
	private List<UserDTO> users = new ArrayList<UserDTO>(0);

	public RoleDTO() {
	}

	public RoleDTO(int idRole, String name, boolean state) {
		this.idRole = idRole;
		this.name = name;
		this.state = state;
	}

	public RoleDTO(int idRole, String name, boolean state, String description, RoleOptionDTO roleOption, List<UserDTO> users) {
		this.idRole = idRole;
		this.name = name;
		this.state = state;
		this.description = description;
		this.roleOption = roleOption;
		this.users = users;
	}

	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isState() {
		return this.state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public RoleOptionDTO getRoleOption() {
		return this.roleOption;
	}

	public void setRoleOption(RoleOptionDTO roleOption) {
		this.roleOption = roleOption;
	}

	public List<UserDTO> getUsers() {
		return this.users;
	}

	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}

}
