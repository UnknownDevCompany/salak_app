package com.bambuco.salak.model;
// Generated 29/05/2016 09:49:36 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * RoleOption generated by hbm2java
 */
@Entity
@Table(name = "role_option", schema = "public")
public class RoleOption implements java.io.Serializable {

	private int idRoleOption;
	private Option option;
	private Role role;
	private int idRole;

	public RoleOption() {
	}

	public RoleOption(Option option, Role role, int idRole) {
		this.option = option;
		this.role = role;
		this.idRole = idRole;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "role"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "id_role_option", unique = true, nullable = false)
	public int getIdRoleOption() {
		return this.idRoleOption;
	}

	public void setIdRoleOption(int idRoleOption) {
		this.idRoleOption = idRoleOption;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_option", nullable = false)
	public Option getOption() {
		return this.option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "id_role", nullable = false)
	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

}