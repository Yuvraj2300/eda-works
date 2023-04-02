package net.ys.eda.ftgo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
public class Address {
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
}
