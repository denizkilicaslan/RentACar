package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;

public interface BrandService {
     public List<GetAllBrandsResponse> getAll();

     void add(CreateBrandRequest createBrandRequest);

     GetByIdBrandResponse getById(int id);

     void delete(int id);

     void update(UpdateBrandRequest updateBrandRequest);

     // delete,update, id ye göre brand getirme
}
