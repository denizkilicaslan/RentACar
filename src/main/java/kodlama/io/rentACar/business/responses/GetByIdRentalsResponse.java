package kodlama.io.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdRentalsResponse {

    private int id;

    private double dailyPrice;

    private int rantedForDays;

    private Date startedDate;

    private String plate;

    private boolean paid;
}
