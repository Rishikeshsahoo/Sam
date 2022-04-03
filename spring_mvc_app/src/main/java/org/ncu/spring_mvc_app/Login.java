package org.ncu.spring_mvc_app;

import java.util.ArrayList;

public class Login {
	private String user;
	private String password;
	private String type;
	private ArrayList<String> typeOptions;
	
	
	
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



	Login()
	{
		typeOptions = new ArrayList<>();
		typeOptions.add("Customer");
		typeOptions.add("Seller");
	}
}
