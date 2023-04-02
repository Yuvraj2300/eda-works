package net.ys.eda.ftgo;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;


@ToString
@EqualsAndHashCode
@Getter
@Embeddable
@Access(AccessType.FIELD)
@NoArgsConstructor
public class Money {

	public static Money ZERO = new Money(0);

	private BigDecimal amount;

	public Money(String s) {
		this.amount = new BigDecimal(s);
	}

	public Money(BigDecimal amount) {
		this.amount = amount;
	}

	public Money(int i) {
		this.amount = new BigDecimal(i);
	}

	public Money add(Money delta) {
		return new Money(amount.add(delta.amount));
	}

	public boolean isGreaterThanOrEqual(Money other) {
		return amount.compareTo(other.amount) >= 0;
	}

	public String asString() {
		return amount.toPlainString();
	}

	public Money multiply(int x) {
		return new Money(amount.multiply(new BigDecimal(x)));
	}

	public Long asLong() {
		return multiply(100).amount.longValue();
	}
}
