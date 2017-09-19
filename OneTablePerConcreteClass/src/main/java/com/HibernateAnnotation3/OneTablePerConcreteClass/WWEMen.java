package com.HibernateAnnotation3.OneTablePerConcreteClass;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="WWEMEN")
@AttributeOverride(column = @Column(name="WRESTLER"), name = "wrestler")
public class WWEMen extends WWE {
	@Column(name="W_NAME")
	private String w_name;
	
	@Column(name="W_AGE")
	private int w_age;

	
	public WWEMen(int wwe_id, String wrestler, String w_name, int w_age) {
		super(wwe_id, wrestler);
		this.w_name = w_name;
		this.w_age = w_age;
	}

	public String getW_name() {
		return w_name;
	}

	public void setW_name(String w_name) {
		this.w_name = w_name;
	}

	public int getW_age() {
		return w_age;
	}

	public void setW_age(int w_age) {
		this.w_age = w_age;
	}
	
	
}
