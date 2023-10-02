package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.MaintenanceService;
import kodlama.io.rentACar.business.requests.CreateMaintenanceRequest;
import kodlama.io.rentACar.business.requests.UpdateMaintenanceRequest;
import kodlama.io.rentACar.business.responses.GetAllMaintenanceResponse;
import kodlama.io.rentACar.business.responses.GetByIdMaintenanceResponse;
import kodlama.io.rentACar.dataAccess.abstracts.MaintenanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceManager implements MaintenanceService {

    private MaintenanceRepository maintenanceRepository;

//    public enum MaintenanceState {
//        AVAILABLE,
//        RENTED,
//        UNDER_MAINTENANCE
//    }
    @Override
    public List<GetAllMaintenanceResponse> getAll() {

        return  null;
    }

    @Override
    public void add(CreateMaintenanceRequest createMaintenanceRequest) {

    }

    @Override
    public GetByIdMaintenanceResponse getById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(UpdateMaintenanceRequest updateMaintenanceRequest) {

    }
}
