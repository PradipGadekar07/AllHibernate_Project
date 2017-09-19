package com.HibernateAnnotation2.OneTablePerSubclassexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "CRICKETS")
@PrimaryKeyJoinColumn(name = "SID")
public class Cricket extends Sports {
	@Column(name = "NO_OF_PLAYERS")
	private int no_of_players;
	@Column(name = "CRICKET_FORMAT")
	private String Cricket_format;
	
	public Cricket(){}
	

	public Cricket(int no_of_players, String cricket_format) {
		super();
		this.no_of_players = no_of_players;
		Cricket_format = cricket_format;
	}


	public int getNo_of_players() {
		return no_of_players;
	}

	public void setNo_of_players(int no_of_players) {
		this.no_of_players = no_of_players;
	}

	public String getCricket_format() {
		return Cricket_format;
	}

	public void setCricket_format(String cricket_format) {
		Cricket_format = cricket_format;
	}

}
