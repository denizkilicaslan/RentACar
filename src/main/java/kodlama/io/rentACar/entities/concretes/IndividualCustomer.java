package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="individualCustomers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class IndividualCustomer extends BaseCustomer {

    @Column(name="firstName")
    private String firstName;

    @Column(name = "lasName")
    private String lastName;

    @Column(name="nationalId",unique = true)
    private String nationalId;








}
