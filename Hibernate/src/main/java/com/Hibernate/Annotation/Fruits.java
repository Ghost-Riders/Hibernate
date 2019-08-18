package com.Hibernate.Annotation;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
	
	@Temporal(TemporalType.TIMESTAMP)//Type-DATE:to set only date not time||Type-TIME: to set time only||Type-TIMESTAMP: to set time and date
	private Date DeliveryDate;

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

	public Date getDeliveryDate() {
		return DeliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	
	
}

