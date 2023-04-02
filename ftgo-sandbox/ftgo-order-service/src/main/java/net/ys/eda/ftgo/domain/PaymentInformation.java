package net.ys.eda.ftgo.domain;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;

@Access(AccessType.FIELD)
public class PaymentInformation {
	
	private String paymentToken;
}
