package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRentalRequest {

    private int rantedForDays;

    private Date startedDate;

    private int carId;

    private int baseCustomerId;
}
