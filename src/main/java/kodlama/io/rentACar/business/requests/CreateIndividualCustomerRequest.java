package kodlama.io.rentACar.business.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateIndividualCustomerRequest {

    @NotNull
    private String mail;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String nationalId;


}
