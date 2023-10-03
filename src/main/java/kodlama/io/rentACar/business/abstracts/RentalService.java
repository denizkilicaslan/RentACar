package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.CreateMaintenanceRequest;
import kodlama.io.rentACar.business.requests.CreateRentalRequest;
import kodlama.io.rentACar.business.requests.UpdateMaintenanceRequest;
import kodlama.io.rentACar.business.requests.UpdateRentalRequest;
import kodlama.io.rentACar.business.responses.GetAllMaintenanceResponse;
import kodlama.io.rentACar.business.responses.GetAllRentalsResponse;
import kodlama.io.rentACar.business.responses.GetByIdMaintenanceResponse;
import kodlama.io.rentACar.business.responses.GetByIdRentalsResponse;

import java.util.List;

public interface RentalService {
    List<GetAllRentalsResponse> getAll();

    void add(CreateRentalRequest createRentalRequest);

    GetByIdRentalsResponse getById(int id);

    void delete(int id);

    void update(UpdateRentalRequest updateRentalRequest);
}
