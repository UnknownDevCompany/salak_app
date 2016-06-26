package com.bambucodev.salak.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the role_option database table.
 * 
 */
@Entity
@Table(name="role_option")
@NamedQuery(name="RoleOption.findAll", query="SELECT r FROM RoleOption r")
public class RoleOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ROLE_OPTION_IDROLEOPTION_GENERATOR", sequenceName="SE_ROLE_OPTION")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROLE_OPTION_IDROLEOPTION_GENERATOR")
	@Column(name="id_role_option")
	private Long idRoleOption;

	@Column(name="id_role")
	private Long idRole;

	//bi-directional many-to-one association to Option
	@ManyToOne
	@JoinColumn(name="id_option")
	private Option option;

	//bi-directional one-to-one association to Role
	@OneToOne
	@JoinColumn(name="id_role_option")
	private Role role;

	public RoleOption() {
	}

	public Long getIdRoleOption() {
		return this.idRoleOption;
	}

	public void setIdRoleOption(Long idRoleOption) {
		this.idRoleOption = idRoleOption;
	}

	public Long getIdRole() {
		return this.idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public Option getOption() {
		return this.option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}