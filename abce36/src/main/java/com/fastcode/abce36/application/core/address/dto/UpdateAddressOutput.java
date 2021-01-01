package com.fastcode.abce36.application.core.address.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateAddressOutput {

  	private String address;
  	private String address2;
  	private Integer addressId;
  	private String district;
  	private LocalDateTime lastUpdate;
  	private String phone;
  	private String postalCode;
  	private Integer cityId;
	private Integer cityDescriptiveField;

}
