package kodlama.io.rentACar.webApi.controller;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.RentalService;
import kodlama.io.rentACar.business.requests.CreateRentalRequest;
import kodlama.io.rentACar.business.requests.UpdateRentalRequest;
import kodlama.io.rentACar.business.responses.GetAllRentalsResponse;
import kodlama.io.rentACar.business.responses.GetByIdRentalsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rentals")
@AllArgsConstructor
public class RentalsController {
    private RentalService rentalService;

    @GetMapping()
    public List<GetAllRentalsResponse> getAll(){
        return rentalService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateRentalRequest createRentalRequest){
        rentalService.add(createRentalRequest);
    }

    @GetMapping(value = "/{id}")
    public GetByIdRentalsResponse getById(@PathVariable int id){
        return rentalService.getById(id);
    }

    @PutMapping(value = "/{id}")
    public void update(@RequestBody UpdateRentalRequest updateRentalRequest){
        rentalService.update(updateRentalRequest);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable int id){
        rentalService.delete(id);
    }
}
