package com.pb.project_a;

import javax.persistence.*;

@Entity
@Table(name="tb_manager")
public class Manager {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	
	
	private String frontID;
	
	private String password;

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Manager(String frontID, String password) {
		super();
		this.frontID = frontID;
		this.password = password;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getFrontID() {
		return frontID;
	}


	public void setFrontID(String frontID) {
		this.frontID = frontID;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
