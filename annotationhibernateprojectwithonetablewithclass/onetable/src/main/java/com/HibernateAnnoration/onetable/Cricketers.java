package com.HibernateAnnoration.onetable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name = "CRICKETERS")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator")
@DiscriminatorValue(value="cricketer")

public class Cricketers {
	    
	@Id
	@GeneratedValue
	@Column(name = "CRICKETER_ID")
	private Long cricketerId;
	
	@Column(name = "CRICKETER_NAME")
	private String cricketername;
	
	@Column(name = "CRICKETER_JERSEYNO")
	private int jerseyno;

	public Long getCricketerId() {
		return cricketerId;
	}

	public void setCricketerId(Long cricketerId) {
		this.cricketerId = cricketerId;
	}

	public String getCricketername() {
		return cricketername;
	}

	public void setCricketername(String cricketername) {
		this.cricketername = cricketername;
	}

	public int getJerseyno() {
		return jerseyno;
	}

	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}
}
