package com.prueba.web.models;

import org.springframework.data.annotation.Id; 
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = "password")
@Entity
@Document(collection = "users")
public class User{
	
	public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
	private @Id @GeneratedValue Long id;
	private String name;
	//String address;
	//String city;
	//String phone;
	//String email;
	//String password;
	private @JsonIgnore String password;
	private String[] roles;
	
	
	/*public User() {		
	}*/
	
	public void setPassword(String password) {
		this.password = PASSWORD_ENCODER.encode(password);
	}
	
	protected User() {}
	
	public User(String name,String password, String... roles) {		
		
		this.name = name;
		//this.address = address;
		//this.city = city;
		//this.phone = phone;
		//this.email = email;	
		//this.password = password;
		this.setPassword(password);
		this.roles = roles;
	}
	/*
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
	
	*/
	
}