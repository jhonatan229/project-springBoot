package com.jhonatanEL.course.entites.enums;

public enum OrderStatus {
 
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int value) {
		for(OrderStatus os : OrderStatus.values()) {
			if(os.getCode() == value) {
				return os;
			}
		}
		throw new IllegalArgumentException("invalid code");
	}
}
