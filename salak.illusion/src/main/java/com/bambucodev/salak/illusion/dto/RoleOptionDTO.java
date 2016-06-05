package com.bambucodev.salak.illusion.dto;
// Generated 29/05/2016 09:49:36 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * RoleOption generated by hbm2java
 */
public class RoleOptionDTO implements java.io.Serializable {

	private int idRoleOption;
	private OptionDTO option;
	private RoleDTO role;
	private int idRole;

	public RoleOptionDTO() {
	}

	public RoleOptionDTO(OptionDTO option, RoleDTO role, int idRole) {
		this.option = option;
		this.role = role;
		this.idRole = idRole;
	}

	public int getIdRoleOption() {
		return this.idRoleOption;
	}

	public void setIdRoleOption(int idRoleOption) {
		this.idRoleOption = idRoleOption;
	}

	public OptionDTO getOption() {
		return this.option;
	}

	public void setOption(OptionDTO option) {
		this.option = option;
	}

	public RoleDTO getRole() {
		return this.role;
	}

	public void setRole(RoleDTO role) {
		this.role = role;
	}

	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

}
