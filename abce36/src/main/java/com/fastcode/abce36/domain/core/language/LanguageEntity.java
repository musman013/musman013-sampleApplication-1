package com.fastcode.abce36.domain.core.language;

import javax.persistence.*;
import java.time.*;
import com.fastcode.abce36.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "LANGUAGE")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class LanguageEntity extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "LANGUAGE_ID", nullable = false)
    private Integer languageId;
    
    @Basic
    @Column(name = "name", nullable = false,length =20)
    private String name;

    @Basic
    @Column(name = "LAST_UPDATE", nullable = false)
    private LocalDateTime lastUpdate;


}



