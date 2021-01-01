package com.fastcode.abce36.domain.core.rental;

import javax.persistence.*;
import java.time.*;
import com.fastcode.abce36.domain.core.inventory.InventoryEntity;
import com.fastcode.abce36.domain.core.customer.CustomerEntity;
import com.fastcode.abce36.domain.core.staff.StaffEntity;
import com.fastcode.abce36.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RENTAL")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class RentalEntity extends AbstractEntity {

    @Basic
    @Column(name = "RENTAL_DATE", nullable = false)
    private LocalDateTime rentalDate;

    @Basic
    @Column(name = "RETURN_DATE", nullable = true)
    private LocalDateTime returnDate;

    @Basic
    @Column(name = "LAST_UPDATE", nullable = false)
    private LocalDateTime lastUpdate;

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "RENTAL_ID", nullable = false)
    private Integer rentalId;
    
    @ManyToOne
    @JoinColumn(name = "STAFF_ID")
    private StaffEntity staff;

    @ManyToOne
    @JoinColumn(name = "INVENTORY_ID")
    private InventoryEntity inventory;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private CustomerEntity customer;


}



