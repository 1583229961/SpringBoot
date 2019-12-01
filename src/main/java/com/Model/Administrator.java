package com.Model;

public class Administrator {
private Integer id;
private String password;
private String name;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 public Administrator() {
	// TODO Auto-generated constructor stub
}
 public Administrator(Integer id,String name)
 
 {
	 super();
	 this.id=id;
	 this.password=password;
 }
}
