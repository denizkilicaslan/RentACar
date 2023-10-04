package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.CorporateCustomerService;
import kodlama.io.rentACar.business.requests.CreateCorporateCustomerRequest;
import kodlama.io.rentACar.business.requests.UpdateCorporateCustomerRequest;
import kodlama.io.rentACar.business.responses.GetAllCarResponse;
import kodlama.io.rentACar.business.responses.GetAllCorporateCustomerResponse;
import kodlama.io.rentACar.business.responses.GetByIdCorporateCustomerResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.CorporateCustomerRepository;
import kodlama.io.rentACar.entities.concretes.Car;
import kodlama.io.rentACar.entities.concretes.CorporateCustomer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CorporateCustomerManager implements CorporateCustomerService {

    private CorporateCustomerRepository corporateCustomerRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllCorporateCustomerResponse> getAll() {
        List<CorporateCustomer> corporateCustomers = corporateCustomerRepository.findAll();
        List<GetAllCorporateCustomerResponse> getAllCorporateCustomerResponses= corporateCustomers.stream()
                .map(corporateCustomer -> this.modelMapperService.forResponse()
                .map(corporateCustomer,GetAllCorporateCustomerResponse.class)).collect(Collectors.toList());
        return getAllCorporateCustomerResponses;
    }

    @Override
    public void add(CreateCorporateCustomerRequest createCorporateCustomerRequest) {
      CorporateCustomer customer =this.modelMapperService.forRequest()
              .map(createCorporateCustomerRequest,CorporateCustomer.class);
        corporateCustomerRepository.save(customer);
    }

    @Override
    public GetByIdCorporateCustomerResponse getById(int id) {
     CorporateCustomer customer= this.corporateCustomerRepository.findById(id).orElseThrow();
     GetByIdCorporateCustomerResponse response = this.modelMapperService.forResponse()
             .map(customer,GetByIdCorporateCustomerResponse.class);
     return response;
    }

    @Override
    public void delete(int id) {
        this.corporateCustomerRepository.deleteById(id);
    }

    @Override
    public void update(UpdateCorporateCustomerRequest updateCorporateCustomerRequest) {
        CorporateCustomer customer =this.modelMapperService.forRequest()
                .map(updateCorporateCustomerRequest,CorporateCustomer.class);
        corporateCustomerRepository.save(customer);

    }
}
