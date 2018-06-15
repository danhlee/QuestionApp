package com.capgemini.QuestionApp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})	// TODO @JsonIgnoreProperties
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //TODO changed AUTO to IDENTITY
	private Long id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	
	@Column(unique=true)
	private String email;
		
	@Temporal(TemporalType.TIMESTAMP)
	@Column(insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")		// updatable=false & insertable=false means mysql will create timestamp for you
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy") // pattern applies to JSON object that is passed back to client
	private Date creationDate;
	
	@Column(columnDefinition="BOOLEAN DEFAULT FALSE")
	private boolean isAdmin;
	
	
	// getters
	public Date getCreationDate() {
		return creationDate;
	}
	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	public Long getId() {
		return id;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	}
	public String getUsername() {
		return username;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	// setters
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
