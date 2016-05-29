package com.bambuco.salak.model;
// Generated 28/05/2016 09:59:11 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */
public class Role implements java.io.Serializable {

	private int idRole;
	private String name;
	private boolean state;
	private String description;
	private RoleOption roleOption;
	private Set<User> users = new HashSet<User>(0);

	public Role() {
	}

	public Role(int idRole, String name, boolean state) {
		this.idRole = idRole;
		this.name = name;
		this.state = state;
	}

	public Role(int idRole, String name, boolean state, String description, RoleOption roleOption, Set<User> users) {
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

	public RoleOption getRoleOption() {
		return this.roleOption;
	}

	public void setRoleOption(RoleOption roleOption) {
		this.roleOption = roleOption;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
