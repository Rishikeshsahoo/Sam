package org.ncu.spring_mvc_app;

import java.util.ArrayList;

public class Entity {
	private String user;
	private String first;
	private String last;
	private String password;
	private String email;
	private String type;
	private ArrayList<String> typeOptions;
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<String> getTypeOptions() {
		return typeOptions;
	}

	public void setTypeOptions(ArrayList<String> typeOptions) {
		this.typeOptions = typeOptions;
	}

	Entity()
	{
		typeOptions = new ArrayList<>();
		typeOptions.add("Customer");
		typeOptions.add("Seller");
	}
	

}
