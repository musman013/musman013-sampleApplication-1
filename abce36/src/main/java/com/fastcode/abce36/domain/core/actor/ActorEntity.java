package com.fastcode.abce36.domain.core.actor;

import javax.persistence.*;
import java.time.*;
import com.fastcode.abce36.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ACTOR")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class ActorEntity extends AbstractEntity {

    @Basic
    @Column(name = "FIRST_NAME", nullable = false,length =45)
    private String firstName;

    @Basic
    @Column(name = "LAST_NAME", nullable = false,length =45)
    private String lastName;

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "ACTOR_ID", nullable = false)
    private Integer actorId;
    
    @Basic
    @Column(name = "LAST_UPDATE", nullable = false)
    private LocalDateTime lastUpdate;


}



