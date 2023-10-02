package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.MaintenanceService;
import kodlama.io.rentACar.business.requests.CreateMaintenanceRequest;
import kodlama.io.rentACar.business.requests.UpdateMaintenanceRequest;
import kodlama.io.rentACar.business.responses.GetAllMaintenanceResponse;
import kodlama.io.rentACar.business.responses.GetByIdMaintenanceResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.MaintenanceRepository;
import kodlama.io.rentACar.entities.concretes.Maintenance;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MaintenanceManager implements MaintenanceService {

    private MaintenanceRepository maintenanceRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllMaintenanceResponse> getAll() {
        List<Maintenance> maintenanceList = maintenanceRepository.findAll();
        List<GetAllMaintenanceResponse> responses = maintenanceList.stream().map(maintenance ->
                this.modelMapperService.forResponse().map(maintenance, GetAllMaintenanceResponse.class)).collect(Collectors.toList());
        return responses;
    }

    @Override
    public void add(CreateMaintenanceRequest createMaintenanceRequest) {
        Maintenance maintenance = this.modelMapperService.forRequest().map(createMaintenanceRequest, Maintenance.class);
        this.maintenanceRepository.save(maintenance);


    }

    @Override
    public GetByIdMaintenanceResponse getById(int id) {
        Maintenance maintenance = this.maintenanceRepository.findById(id).orElseThrow();
        GetByIdMaintenanceResponse response = this.modelMapperService.forResponse().map(maintenance, GetByIdMaintenanceResponse.class);
        return response;
    }

    @Override
    public void delete(int id) {
        this.maintenanceRepository.deleteById(id);
    }

    @Override
    public void update(UpdateMaintenanceRequest updateMaintenanceRequest) {
        Maintenance maintenance = this.modelMapperService.forRequest().map(updateMaintenanceRequest, Maintenance.class);
        this.maintenanceRepository.save(maintenance);

    }

//    public void parseEnum(String status){
//        /*
//          MaintenanceStatus status = MaintenanceStatus.valueOf(createCarRequest.getMaintanence());
//        car.setStatus(status);
//        this.carRepository.save(car);
//    }
//         */
//        MaintenanceState state = MaintenanceState.valueOf(status);
//
//    }
}
