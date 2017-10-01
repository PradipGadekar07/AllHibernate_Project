package com.HibernateNativeQuery.NativeSQL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(
		{
	     
			@NamedQuery(name = "workerbyname", query = "from Worker w where w.name = :name"
					
					)
         }
		)
@Entity
@Table(name="WORKER")
public class Worker {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double salary;
	private String Dept;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", salary=" + salary + ", Dept=" + Dept + "]";
	}
	
	public Worker(){}
	public Worker(int id, String name, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		Dept = dept;
	}
	
}
