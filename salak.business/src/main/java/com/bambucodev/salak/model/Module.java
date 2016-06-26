package com.bambucodev.salak.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


/**
 * The persistent class for the module database table.
 * 
 */
@Entity
@NamedQuery(name="Module.findAll", query="SELECT m FROM Module m")
public class Module implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MODULE_IDMODULE_GENERATOR", sequenceName="SE_MODULE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MODULE_IDMODULE_GENERATOR")
	@Column(name="id_module")
	private Long idModule;

	private String name;

	private Boolean state;

	//bi-directional many-to-one association to Option
	@OneToMany(mappedBy="module")
	private List<Option> options;

	public Module() {
	}

	public Long getIdModule() {
		return this.idModule;
	}

	public void setIdModule(Long idModule) {
		this.idModule = idModule;
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

	public List<Option> getOptions() {
		return this.options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public Option addOption(Option option) {
		getOptions().add(option);
		option.setModule(this);

		return option;
	}

	public Option removeOption(Option option) {
		getOptions().remove(option);
		option.setModule(null);

		return option;
	}

}