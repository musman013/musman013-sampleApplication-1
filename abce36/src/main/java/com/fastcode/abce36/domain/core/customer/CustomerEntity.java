package com.fastcode.abce36.domain.core.customer;

import javax.persistence.*;
import java.time.*;
import com.fastcode.abce36.domain.core.address.AddressEntity;
import com.fastcode.abce36.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CUSTOMER")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class CustomerEntity extends AbstractEntity {

    @Basic
    @Column(name = "LAST_NAME", nullable = false,length =50)
    private String lastName;

    @Basic
    @Column(name = "active", nullable = true)
    private Integer active;
    
    @Basic
    @Column(name = "activebool", nullable = false)
    private Boolean activebool;
    
    @Basic
    @Column(name = "STORE_ID", nullable = true)
    private Short storeId;
    
    @Basic
    @Column(name = "FIRST_NAME", nullable = false,length =50)
    private String firstName;

    @Basic
    @Column(name = "LAST_UPDATE", nullable = true)
    private LocalDateTime lastUpdate;

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "CUSTOMER_ID", nullable = false)
    private Integer customerId;
    
    @Basic
    @Column(name = "email", nullable = true,length =50)
    private String email;

    @Basic
    @Column(name = "CREATE_DATE", nullable = false)
    private LocalDate createDate;

    @ManyToOne
    @JoinColumn(name = "ADDRESS_ID")
    private AddressEntity address;


}



