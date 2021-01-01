package com.fastcode.abce36.domain.core.inventory;

import javax.persistence.*;
import java.time.*;
import com.fastcode.abce36.domain.core.film.FilmEntity;
import com.fastcode.abce36.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "INVENTORY")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class InventoryEntity extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "INVENTORY_ID", nullable = false)
    private Integer inventoryId;
    
    @Basic
    @Column(name = "STORE_ID", nullable = true)
    private Short storeId;
    
    @Basic
    @Column(name = "LAST_UPDATE", nullable = false)
    private LocalDateTime lastUpdate;

    @ManyToOne
    @JoinColumn(name = "FILM_ID")
    private FilmEntity film;


}



