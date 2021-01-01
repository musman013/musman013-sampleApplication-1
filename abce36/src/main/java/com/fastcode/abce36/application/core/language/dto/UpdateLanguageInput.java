package com.fastcode.abce36.application.core.language.dto;

import java.time.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateLanguageInput {

  	@NotNull(message = "languageId Should not be null")
  	private Integer languageId;
  	
  	@NotNull(message = "lastUpdate Should not be null")
  	private LocalDateTime lastUpdate;
  	
  	@NotNull(message = "name Should not be null")
 	@Length(max = 20, message = "name must be less than 20 characters")
  	private String name;
  	
  	private Long versiono;
  
}

