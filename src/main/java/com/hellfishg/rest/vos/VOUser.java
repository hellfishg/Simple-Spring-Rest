package com.hellfishg.rest.vos;

import java.io.Serializable;

public class VOUser implements Serializable {

	private static final long serialVersionUID = 6995905539464990645L;
	private String user;
	private String password;
	private boolean find;

	// Getters and Setters:
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isFind() {
		return find;
	}

	public void setFind(boolean find) {
		this.find = find;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
