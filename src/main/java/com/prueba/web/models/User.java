package com.prueba.web.models;

//import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;
/*
@Data
@ToString(exclude = "password")
@Entity
*/
@Document(collection = "users")
public class User {
	
	@Id
	String id;
	String name;
	String address;
	String city;
	String phone;
	String email;
	String password;
	
	public User() {		
	}
	
	
	public User(String name, String address, String city, String phone, String email, String password) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;	
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
}