package com.fastcode.abce36.application.core.country.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateCountryOutput {

  	private String country;
  	private Integer countryId;
  	private LocalDateTime lastUpdate;

}
