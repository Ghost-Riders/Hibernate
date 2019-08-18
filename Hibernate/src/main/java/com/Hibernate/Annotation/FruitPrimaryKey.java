package com.Hibernate.Annotation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FruitPrimaryKey {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//Generate auto increment Primary key||AUTO chooses as per database like oracle will user GenerationType.SEQUENCE 
	private int FruitCount;
	private String FruitName;

	public int getFruitCount() {
		return FruitCount;
	}

	public void setFruitCount(int fruitCount) {
		FruitCount = fruitCount;
	}

	public String getFruitName() {
		return FruitName;
	}

	public void setFruitName(String fruitName) {
		FruitName = fruitName;
	}

}
