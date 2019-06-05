package org.kaushik.javabrains.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	
	private long id;
	private String ProfileName;
	private String firstName;
	private String lastName;
	private Date created;
	
	public Profile() {
		// TODO Auto-generated constructor stub
	}
	
	public Profile(long id, String profileName, String firstName, String lastName) {
		super();
		this.id = id;
		ProfileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.created = new Date();;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfileName() {
		return ProfileName;
	}
	public void setProfileName(String profileName) {
		ProfileName = profileName;
	}
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

	

	
	

}
