package kodlama.io.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdCorporateCustomerResponse {

    private String mail;
    private String phoneNumber;
    private String taxNumber;
    private String companyName;
    private String contactName;
}
