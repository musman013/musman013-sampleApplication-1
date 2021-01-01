package com.fastcode.abce36.domain.core.country;

import javax.persistence.*;
import java.time.*;
import com.fastcode.abce36.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "COUNTRY")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class CountryEntity extends AbstractEntity {

    @Basic
    @Column(name = "country", nullable = false,length =50)
    private String country;

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "COUNTRY_ID", nullable = false)
    private Integer countryId;
    
    @Basic
    @Column(name = "LAST_UPDATE", nullable = false)
    private LocalDateTime lastUpdate;


}



