package com.kani.reactor.flatmap;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
 class Address {

	String employeeId;
	String street;
	String city;
	String state;
	String zip;

}
