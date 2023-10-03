package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRentalRequest {

    private int id;

    private int rantedForDays;

    private String paymentId;

    private Date startedDate;

    private String plate;
}
