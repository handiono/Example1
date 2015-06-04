package com.escurity.test1.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8336347376096891913L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique=true)
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String enable;
	
	@OneToMany(mappedBy="users", cascade = CascadeType.ALL)
    private Set<UserRoles> userRoless;

	public Users() {
	}

	public Users(String username, String password, String enable) {
		super();
		this.username = username;
		this.password = password;
		this.enable = enable;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public Set<UserRoles> getUserRoless() {
		return userRoless;
	}

	public void setUserRoless(Set<UserRoles> userRoless) {
		this.userRoless = userRoless;
	}
	
	

}
