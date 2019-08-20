package com.Hibernate.ManyToOneMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "institute")
public class Institute {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int institute_id;
	private String institute_name;

	public int getInstitute_id() {
		return institute_id;
	}

	public void setInstitute_id(int institute_id) {
		this.institute_id = institute_id;
	}

	public String getInstitute_name() {
		return institute_name;
	}

	public void setInstitute_name(String institute_name) {
		this.institute_name = institute_name;
	}

}
