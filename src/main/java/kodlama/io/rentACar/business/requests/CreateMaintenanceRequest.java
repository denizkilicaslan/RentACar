package kodlama.io.rentACar.business.requests;

import kodlama.io.rentACar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMaintenanceRequest {

    private Date startDate;
    private int carId;
}
