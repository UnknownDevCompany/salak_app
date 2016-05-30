package com.bambuco.salak.illusion.dto;
// Generated 29/05/2016 09:49:36 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private int idUser;
	private Role role;
	private String name;
	private String lastName;
	private String login;
	private String password;
	private String EMail;
	private Boolean state;

	public User() {
	}

	public User(int idUser, Role role, String login) {
		this.idUser = idUser;
		this.role = role;
		this.login = login;
	}

	public User(int idUser, Role role, String name, String lastName, String login, String password, String EMail,
			Boolean state) {
		this.idUser = idUser;
		this.role = role;
		this.name = name;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
		this.EMail = EMail;
		this.state = state;
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

}
