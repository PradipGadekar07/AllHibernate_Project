package com.HibernateAnnotation3.OneTablePerConcreteClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="WWE")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class WWE {
	@Id
	@Column(name="WWE_ID")
	private int wwe_id;
	
	@Column(name="WRESTLER")
	private String wrestler;
	
	public WWE(int wwe_id, String wrestler) {
		super();
		this.wwe_id = wwe_id;
		this.wrestler = wrestler;
	}

	public int getWwe_id() {
		return wwe_id;
	}

	public void setWwe_id(int wwe_id) {
		this.wwe_id = wwe_id;
	}

	public String getWrestler() {
		return wrestler;
	}

	public void setWrestler(String wrestler) {
		this.wrestler = wrestler;
	}
	
	
	
	
}