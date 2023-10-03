package kodlama.io.rentACar.business.requests;

import jakarta.validation.constraints.NotNull;
import kodlama.io.rentACar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMaintenanceRequest {

    @NotNull
    private Date startDate;

    @NotNull
    private int carId;
}
