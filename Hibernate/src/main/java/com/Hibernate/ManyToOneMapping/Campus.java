package com.Hibernate.ManyToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "campus")
public class Campus {

	@Id
	@GeneratedValue
	private int campus_id;
	private String campus_name;

	@ManyToOne(cascade = CascadeType.ALL)
	private Institute institute;

	public int getCampus_id() {
		return campus_id;
	}

	public void setCampus_id(int campus_id) {
		this.campus_id = campus_id;
	}

	public String getCampus_name() {
		return campus_name;
	}

	public void setCampus_name(String campus_name) {
		this.campus_name = campus_name;
	}

	public Institute getInstitute() {
		return institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}
	
	

}
