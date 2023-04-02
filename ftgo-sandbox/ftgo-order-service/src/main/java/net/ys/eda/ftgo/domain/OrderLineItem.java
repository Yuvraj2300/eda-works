package net.ys.eda.ftgo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ys.eda.ftgo.Money;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItem {
	private int quantity;

	private String menuItemId;

	private String name;

	@Embedded
	@AttributeOverrides(@AttributeOverride(name = "amount", column = @Column(name = "price")))
	Money price;

}
