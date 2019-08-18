package com.Hibernate.OneToOneMappingUniBidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class OrderDetail {

	@Id
	@GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name = "newGenerator",strategy = "foreign",parameters = {@Parameter(value = "order",name = "property")})
	private int orderid;
	
	private String orderStatus;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderid")
	private Order order;
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
}
