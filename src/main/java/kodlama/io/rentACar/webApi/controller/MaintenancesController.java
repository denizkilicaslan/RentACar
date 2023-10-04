package kodlama.io.rentACar.webApi.controller;

import kodlama.io.rentACar.business.abstracts.MaintenanceService;
import kodlama.io.rentACar.business.requests.CreateMaintenanceRequest;
import kodlama.io.rentACar.business.requests.UpdateMaintenanceRequest;
import kodlama.io.rentACar.business.responses.GetAllMaintenanceResponse;
import kodlama.io.rentACar.business.responses.GetByIdMaintenanceResponse;
import kodlama.io.rentACar.entities.concretes.Maintenance;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/maintenances")
public class MaintenancesController {
    private MaintenanceService maintenanceService;

    @GetMapping()
    public List<GetAllMaintenanceResponse> getAll(){
        return this.maintenanceService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdMaintenanceResponse getById(@PathVariable int id){
        return this.maintenanceService.getById(id);
    }
    
    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody CreateMaintenanceRequest createMaintenanceRequest){
        this.maintenanceService.add(createMaintenanceRequest);
    }

    @PutMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void update(@RequestBody UpdateMaintenanceRequest updateMaintenanceRequest){
        this.maintenanceService.update(updateMaintenanceRequest);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(code=HttpStatus.OK)
    public void delete(@PathVariable int id){
        this.maintenanceService.delete(id);
    }

}
