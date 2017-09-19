package com.HibernateAnnotation3.OneTablePerConcreteClass;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WWWWOMEN")
@AttributeOverride(column = @Column(name="WRESTLER"), name = "wrestler")
public class WWEWomen extends WWE {
public WWEWomen(int wwe_id, String wrestler) {
		super(wwe_id, wrestler);
		// TODO Auto-generated constructor stub
	}

@Column(name="WW_NAME")
private String ww_name;

@Column(name="COUNTRY")
private String country;



public String getWw_name() {
	return ww_name;
}

public void setWw_name(String ww_name) {
	this.ww_name = ww_name;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

}
