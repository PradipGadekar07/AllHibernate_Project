package com.HibernateAnnoration.onetable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="T20players")
public class T20Players extends Cricketers{

	 @Column(name="PLAYER_AGE")
     private int playerage;
	 @Column(name="COUNTRY")
     private String country;
	 
	public int getPlayerage() {
		return playerage;
	}
	public void setPlayerage(int playerage) {
		this.playerage = playerage;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	 
	 
}
