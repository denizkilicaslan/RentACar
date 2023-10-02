package kodlama.io.rentACar.webApi.controller;

import kodlama.io.rentACar.business.abstracts.CarService;
import kodlama.io.rentACar.business.requests.CreateCarRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateCarRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetAllCarResponse;
import kodlama.io.rentACar.business.responses.GetByIdCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarsController {
    private CarService carService;

    @GetMapping()
    public List<GetAllCarResponse> getAll() {

        return carService.getAll();
    }
    @GetMapping("/{id}")
    public GetByIdCarResponse getById(@PathVariable int id){
        return carService.getById(id);
    }
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateCarRequest request) {
        carService.add(request);
    }
    @PutMapping(value="/{id}")
    public void update( @RequestBody UpdateCarRequest updateCarRequest) {
        carService.update(updateCarRequest);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable int id) {
        carService.delete(id);
    }

}
