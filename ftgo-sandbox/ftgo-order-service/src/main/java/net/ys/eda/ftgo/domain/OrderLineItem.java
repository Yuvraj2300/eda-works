package net.ys.eda.ftgo.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class OrderLineItem {
	private int quantity;

	private String menuItemId;

	private String name;

}
