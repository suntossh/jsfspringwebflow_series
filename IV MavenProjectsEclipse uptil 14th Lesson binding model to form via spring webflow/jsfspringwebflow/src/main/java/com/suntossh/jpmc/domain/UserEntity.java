package com.suntossh.jpmc.domain;

import java.io.Serializable;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;

public class UserEntity implements Serializable {

	private static final long serialVersionUID = 9187027149004345353L;
	
	private String firstName;
    private String lastName;
    private String userName;
    private String password;
	
    public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
		this.password = passwordEncoder.encodePassword(password, null);
	}
    
    
    
}
