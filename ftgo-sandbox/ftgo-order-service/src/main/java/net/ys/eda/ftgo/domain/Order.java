package net.ys.eda.ftgo.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.ys.eda.ftgo.Money;

import java.util.List;

@Entity(name = "Order")
@Table(name = "orders")
@Access(AccessType.FIELD)
@Getter
@Setter
@ToString
public class Order {

	public static Order createOrder() {
		return null;
	}

	@Id
	@GeneratedValue
	Long id;

	private Long consumerId;

	private Long restaurantId;

	@Version
	private Long version;

	@Enumerated(EnumType.STRING)
	private OrderState state;

	@Embedded
	private OrderLineItems orderLineItems;

	@Embedded
	private DeliveryInformation deliveryInformation;

	@Embedded
	private PaymentInformation paymentInformation;

	private Money orderMinimum = new Money(Integer.MAX_VALUE);

	public Order(long consumerId, long restaurantId, DeliveryInformation deliveryInformation, List<OrderLineItem> orderLineItems) {
		this.consumerId = consumerId;
		this.restaurantId = restaurantId;
		this.deliveryInformation = deliveryInformation;
		this.orderLineItems = new OrderLineItems(orderLineItems);
		//		this.state = APPROVAL_PENDING;
	}

	public Order() {
	}

	public void cancel() {
	}

	public void undoPendingCancel() {
	}

	public void noteCancelled() {
	}

	public void noteApproved() {
	}

	public void noteRejected() {
	}

	public void noteReverseingAuthorization() {
	}


	public void revise() {
	}

	public void confirmRevision() {
	}
}



