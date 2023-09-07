package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {
     public List<GetAllBrandsResponse> getAll();
     void add(CreateBrandRequest createBrandRequest);

     // delete,update, id ye göre brand getirme 
}
