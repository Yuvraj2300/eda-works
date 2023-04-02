package net.ys.eda.ftgo.domain;


import jakarta.persistence.*;
import lombok.ToString;

@Entity(name = "Order")
@Table(name = "orders")
@Access(AccessType.FIELD)
@ToString
public class Order {

	@Id
	@GeneratedValue
	Long id;

	private Long consumerId;

	private Long restaurantId;

	@Version
	private Long version;
	//where to put this?
	//	private OrderState state;

	@Embedded
	private OrderLineItems orderLineItem;

	@Embedded
	private DeliveryInformation deliveryInformation;

	@Embedded
	private PaymentInformation paymentInformation;

	//Add Money


}
