package kodlama.io.rentACar.business.abstracts;


import kodlama.io.rentACar.business.requests.CreateCorporateCustomerRequest;
import kodlama.io.rentACar.business.requests.UpdateCorporateCustomerRequest;
import kodlama.io.rentACar.business.responses.GetAllCorporateCustomerResponse;
import kodlama.io.rentACar.business.responses.GetByIdCorporateCustomerResponse;

import java.util.List;

public interface CorporateCustomerService {
    public List<GetAllCorporateCustomerResponse> getAll();

    void add(CreateCorporateCustomerRequest createCorporateCustomerRequest);

    GetByIdCorporateCustomerResponse getById(int id);

    void delete(int id);

    void update(UpdateCorporateCustomerRequest updateCorporateCustomerRequest);
}
