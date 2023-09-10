package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.rules.BrandBusinessRules;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    private BrandBusinessRules BrandBusinessRules;

    /*
     * @Autowired // @AllArgsConstructor sayesinde inj edilir
     * public BrandManager(BrandRepository brandRepository) {
     * this.brandRepository = brandRepository;
     * }
     */

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll();
        /*
         * List<GetAllBrandsResponse> brandsResponses = new
         * ArrayList<GetAllBrandsResponse>();
         * 
         * for (Brand brand : brands) {
         * GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
         * responseItem.setId(brand.getId());
         * responseItem.setName(brand.getName());
         * brandsResponses.add(responseItem);
         * }
         */

        List<GetAllBrandsResponse> brandsResponses = brands.stream()
                .map(brand -> this.modelMapperService.forResponse().map(brand, GetAllBrandsResponse.class))
                .collect(Collectors.toList());
        return brandsResponses;
        // return brandRepository.findAll();
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        /*
         * Brand brand = new Brand();
         * brand.setName(createBrandRequest.getName());
         */

        this.BrandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
        brandRepository.save(brand);

    }

    @Override
    public GetByIdBrandResponse getById(int id) {

        // Brand brand =brandRepository.findById(id).orElseThrow(); bulamazsan hata
        // fırlat
        Optional<Brand> brand = brandRepository.findById(id);
        if (brand.isPresent()) {
            GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand,
                    GetByIdBrandResponse.class);
            return response;
        }

        return null;

    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);

    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        this.brandRepository.save(brand);

    }

}
