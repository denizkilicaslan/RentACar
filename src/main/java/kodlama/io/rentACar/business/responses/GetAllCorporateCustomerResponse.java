package kodlama.io.rentACar.business.responses;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCorporateCustomerResponse {

    private int id;
    private String mail;
    private String phoneNumber;
    private String taxNumber;
    private String companyName;
    private String contactName;

}
