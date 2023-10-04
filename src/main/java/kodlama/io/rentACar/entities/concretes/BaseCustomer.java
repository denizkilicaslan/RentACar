package kodlama.io.rentACar.entities.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Table(name = "baseCustomers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseCustomer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "createdDate")
    private Date createdDate;

    @Column(name = "mail")
    private String mail;

    @Column(name="phoneNumber")
    private String phoneNumber;

    @OneToMany(mappedBy = "baseCustomer")
    private List<Rental> rentalList;

}
