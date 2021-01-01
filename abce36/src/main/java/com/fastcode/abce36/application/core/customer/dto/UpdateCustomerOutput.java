package com.fastcode.abce36.application.core.customer.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateCustomerOutput {

  	private Integer active;
  	private Boolean activebool;
  	private LocalDate createDate;
  	private Integer customerId;
  	private String email;
  	private String firstName;
  	private String lastName;
  	private LocalDateTime lastUpdate;
  	private Short storeId;
  	private Integer addressId;
	private Integer addressDescriptiveField;

}
