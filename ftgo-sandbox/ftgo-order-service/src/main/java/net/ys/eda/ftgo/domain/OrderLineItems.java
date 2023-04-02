package net.ys.eda.ftgo.domain;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Embeddable
@NoArgsConstructor
@ToString
@Data
@AllArgsConstructor
public class OrderLineItems {

	@ElementCollection
	@CollectionTable
	List<OrderLineItem> lineItems;
}


