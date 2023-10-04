package kodlama.io.rentACar.webApi.controller;

import kodlama.io.rentACar.business.abstracts.CorporateCustomerService;
import kodlama.io.rentACar.business.requests.CreateCorporateCustomerRequest;
import kodlama.io.rentACar.business.requests.CreateIndividualCustomerRequest;
import kodlama.io.rentACar.business.requests.UpdateCorporateCustomerRequest;
import kodlama.io.rentACar.business.requests.UpdateIndividualCustomerRequest;
import kodlama.io.rentACar.business.responses.GetAllCorporateCustomerResponse;
import kodlama.io.rentACar.business.responses.GetAllIndividualCustomerResponse;
import kodlama.io.rentACar.business.responses.GetByIdCorporateCustomerResponse;
import kodlama.io.rentACar.business.responses.GetByIdIndividualCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/corporates")
public class CorporateCustomerController {
    private CorporateCustomerService corporateCustomerService;

    @GetMapping
    public List<GetAllCorporateCustomerResponse> getAll() {
        return this.corporateCustomerService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdCorporateCustomerResponse getById(@PathVariable int id) {
        return this.corporateCustomerService.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateCorporateCustomerRequest createCorporateCustomerRequest) {
        this.corporateCustomerService.add(createCorporateCustomerRequest);
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void update(@RequestBody UpdateCorporateCustomerRequest updateCorporateCustomerRequest) {
        this.corporateCustomerService.update(updateCorporateCustomerRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable int id) {
        this.corporateCustomerService.delete(id);
    }

}
