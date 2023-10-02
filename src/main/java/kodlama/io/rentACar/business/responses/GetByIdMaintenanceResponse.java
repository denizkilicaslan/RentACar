package kodlama.io.rentACar.business.responses;

import kodlama.io.rentACar.core.utilities.MaintenanceState;
import kodlama.io.rentACar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdMaintenanceResponse {
    private int id;
    private Car carId;
    private MaintenanceState state;
}
