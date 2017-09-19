package com.HibernateAnnotation2.OneTablePerSubclassexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "BADMINTON")
@PrimaryKeyJoinColumn(name = "SID")
public class Badminton extends Sports {
	@Column(name = "TROPHY")
	private String trophy;
	@Column(name = "CLUB")
	private String club;

	public Badminton() {
	}

	

	public Badminton(String trophy, String club) {
		super();
		this.trophy = trophy;
		this.club = club;
	}



	public String getTrophy() {
		return trophy;
	}

	public void setTrophy(String trophy) {
		this.trophy = trophy;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

}
