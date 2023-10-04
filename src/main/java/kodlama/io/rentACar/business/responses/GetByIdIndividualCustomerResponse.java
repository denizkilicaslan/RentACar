package kodlama.io.rentACar.business.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdIndividualCustomerResponse {
    private String mail;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String nationalId;
}
