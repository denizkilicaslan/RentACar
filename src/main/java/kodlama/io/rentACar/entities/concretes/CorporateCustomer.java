package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "corporateCustomer")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorporateCustomer extends BaseCustomer {

    @Column(name = "taxNumber", unique = true)
    private String taxNumber;

    @Column(name = "companyName")
    private String companyName;

    @Column(name="contactName")
    private String contactName;




}
