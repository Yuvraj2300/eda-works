package net.ys.eda.ftgo.domain;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Embedded;

import java.time.LocalDateTime;

@Access(AccessType.FIELD)
public class DeliveryInformation {

	private LocalDateTime deliveryTime;

	@Embedded
	//move to common
	private Address deliveryAddress;

}
