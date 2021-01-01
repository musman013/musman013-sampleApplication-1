package com.fastcode.abce36.application.core.inventory.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter @Setter
public class GetFilmOutput {

 	private String description;
 	private Integer filmId;
 	private LocalDateTime lastUpdate;
 	private Short length;
 	private String rating;
 	private Integer releaseYear;
 	private Short rentalDuration;
 	private BigDecimal rentalRate;
 	private BigDecimal replacementCost;
 	private String title;
  	private Integer inventoryInventoryId;

}

