package com.HibernateAnnotation2.OneTablePerSubclassexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Table(name = "SPORTS")
@Inheritance(strategy=javax.persistence.InheritanceType.JOINED)

public class Sports {
@Id
@GeneratedValue
@Column(name="SID")
private int sid;
@Column(name ="SPORT_NAME")
private String Sport_name;
@Column(name="SPORT_TYPE")
private String Sport_type;

public Sports() {
	
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getSport_name() {
	return Sport_name;
}

public void setSport_name(String sport_name) {
	Sport_name = sport_name;
}

public String getSport_type() {
	return Sport_type;
}

public void setSport_type(String sport_type) {
	Sport_type = sport_type;
}


}
