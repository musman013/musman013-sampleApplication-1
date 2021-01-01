package com.fastcode.abce36.domain.core.city;

import javax.persistence.*;
import java.time.*;
import com.fastcode.abce36.domain.core.country.CountryEntity;
import com.fastcode.abce36.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CITY")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class CityEntity extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "CITY_ID", nullable = false)
    private Integer cityId;
    
    @Basic
    @Column(name = "city", nullable = false,length =50)
    private String city;

    @Basic
    @Column(name = "LAST_UPDATE", nullable = false)
    private LocalDateTime lastUpdate;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    private CountryEntity country;


}



