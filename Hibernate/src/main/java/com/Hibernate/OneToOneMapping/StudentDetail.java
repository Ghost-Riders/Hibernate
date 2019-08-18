package com.Hibernate.OneToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class StudentDetail {

	@Id
	@GeneratedValue(generator = "newGenerator")//Name of the primary key generator
	@GenericGenerator(name = "newGenerator",strategy = "foreign" ,parameters = {@Parameter(value = "student",name = "property")})
	private int student_id;

	private String student_mobile_nuumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_mobile_nuumber() {
		return student_mobile_nuumber;
	}

	public void setStudent_mobile_nuumber(String student_mobile_nuumber) {
		this.student_mobile_nuumber = student_mobile_nuumber;
	}

}
