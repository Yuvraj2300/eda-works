package net.ys.eda.ftgo.domain;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Access(AccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInformation {

	private String paymentToken;
}
