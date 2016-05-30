package com.bambuco.salak.model;
// Generated 29/05/2016 09:49:36 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Option generated by hbm2java
 */
@Entity
@Table(name = "option", schema = "public")
public class Option implements java.io.Serializable {

	private int idOption;
	private Module module;
	private String name;
	private String value;
	private Boolean state;
	private Set<RoleOption> roleOptions = new HashSet<RoleOption>(0);

	public Option() {
	}

	public Option(int idOption, Module module) {
		this.idOption = idOption;
		this.module = module;
	}

	public Option(int idOption, Module module, String name, String value, Boolean state, Set<RoleOption> roleOptions) {
		this.idOption = idOption;
		this.module = module;
		this.name = name;
		this.value = value;
		this.state = state;
		this.roleOptions = roleOptions;
	}

	@Id

	@Column(name = "id_option", unique = true, nullable = false)
	public int getIdOption() {
		return this.idOption;
	}

	public void setIdOption(int idOption) {
		this.idOption = idOption;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_module", nullable = false)
	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "value", length = 200)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "state")
	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "option")
	public Set<RoleOption> getRoleOptions() {
		return this.roleOptions;
	}

	public void setRoleOptions(Set<RoleOption> roleOptions) {
		this.roleOptions = roleOptions;
	}

}
