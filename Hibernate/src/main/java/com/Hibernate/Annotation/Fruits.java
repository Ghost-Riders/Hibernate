package com.Hibernate.Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Fruits_List")//changed Table name
public class Fruits {
	
	@Id
	private int FruitCount;
	
	@Column(name="Fruit_Name",nullable=false)//changed column name & remove Null property
	private String FruitName;
	
	@Transient //Ignore this field for column creation
	@Column(name="Fruit_Delivery")
	private String FruitDelivery;

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

	public String getFruitDelivery() {
		return FruitDelivery;
	}

	public void setFruitDelivery(String fruitDelivery) {
		FruitDelivery = fruitDelivery;
	}
	
	
}

