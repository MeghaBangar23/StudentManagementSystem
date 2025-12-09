package com.studentmanage.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Admin_table")
public class Admin
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int adminId;

@Column(name="Name")
private String name;

@Column(name="UserName")
private String userName;

@Column(name="Password")
private String password;

public Admin(){}
public Admin(int adminId, String name, String userName, String password) {
	this.adminId = adminId;
	this.name = name;
	this.userName = userName;
	this.password = password;
}
public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
	this.password = password;
}


}
