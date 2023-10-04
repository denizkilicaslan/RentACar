package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.CreateIndividualCustomerRequest;
import kodlama.io.rentACar.business.requests.UpdateIndividualCustomerRequest;
import kodlama.io.rentACar.business.responses.GetAllIndividualCustomerResponse;
import kodlama.io.rentACar.business.responses.GetByIdIndividualCustomerResponse;

import java.util.List;

public interface IndividualCustomerService {
    public List<GetAllIndividualCustomerResponse> getAll();

    void add(CreateIndividualCustomerRequest createIndividualCustomerRequest);

    GetByIdIndividualCustomerResponse getById(int id);

    void delete(int id);

    void update(UpdateIndividualCustomerRequest updateIndividualCustomerRequest);

}
