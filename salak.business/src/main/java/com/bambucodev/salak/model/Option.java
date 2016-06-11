package com.bambucodev.salak.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


/**
 * The persistent class for the option database table.
 * 
 */
@Entity
@NamedQuery(name="Option.findAll", query="SELECT o FROM Option o")
public class Option implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OPTION_IDOPTION_GENERATOR", sequenceName="SE_OPTION")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OPTION_IDOPTION_GENERATOR")
	@Column(name="id_option")
	private Integer idOption;

	private String name;

	private Boolean state;

	private String value;

	//bi-directional many-to-one association to Module
	@ManyToOne
	@JoinColumn(name="id_module")
	private Module module;

	//bi-directional many-to-one association to RoleOption
	@OneToMany(mappedBy="option")
	private List<RoleOption> roleOptions;

	public Option() {
	}

	public Integer getIdOption() {
		return this.idOption;
	}

	public void setIdOption(Integer idOption) {
		this.idOption = idOption;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public List<RoleOption> getRoleOptions() {
		return this.roleOptions;
	}

	public void setRoleOptions(List<RoleOption> roleOptions) {
		this.roleOptions = roleOptions;
	}

	public RoleOption addRoleOption(RoleOption roleOption) {
		getRoleOptions().add(roleOption);
		roleOption.setOption(this);

		return roleOption;
	}

	public RoleOption removeRoleOption(RoleOption roleOption) {
		getRoleOptions().remove(roleOption);
		roleOption.setOption(null);

		return roleOption;
	}

}