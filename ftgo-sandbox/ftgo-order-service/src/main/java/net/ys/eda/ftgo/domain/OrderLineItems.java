package net.ys.eda.ftgo.domain;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;

import java.util.List;

@Embeddable
public class OrderLineItems {

	@ElementCollection
	@CollectionTable
	List<OrderLineItem> lineItems;
}
