package kodlama.io.rentACar.webApi.controller;

import kodlama.io.rentACar.business.abstracts.IndividualCustomerService;
import kodlama.io.rentACar.business.requests.CreateIndividualCustomerRequest;
import kodlama.io.rentACar.business.requests.UpdateIndividualCustomerRequest;
import kodlama.io.rentACar.business.responses.GetAllIndividualCustomerResponse;
import kodlama.io.rentACar.business.responses.GetByIdIndividualCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/individuals")
public class IndividualCustomerController {
    private IndividualCustomerService individualCustomerService;

    @GetMapping
    public List<GetAllIndividualCustomerResponse> getAll() {
        return this.individualCustomerService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdIndividualCustomerResponse getById(@PathVariable int id) {
        return this.individualCustomerService.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateIndividualCustomerRequest createIndividualCustomerRequest) {
        this.individualCustomerService.add(createIndividualCustomerRequest);
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void update(@RequestBody UpdateIndividualCustomerRequest updateIndividualCustomerRequest) {
        this.individualCustomerService.update(updateIndividualCustomerRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable int id) {
        this.individualCustomerService.delete(id);
    }

}
