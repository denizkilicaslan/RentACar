package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.CreateMaintenanceRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateMaintenanceRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetAllMaintenanceResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.responses.GetByIdMaintenanceResponse;

import java.util.List;

public interface MaintenanceService {

    List<GetAllMaintenanceResponse> getAll();

    void add(CreateMaintenanceRequest createMaintenanceRequest);

    GetByIdMaintenanceResponse getById(int id);

    void delete(int id);

    void update(UpdateMaintenanceRequest updateMaintenanceRequest);
}
