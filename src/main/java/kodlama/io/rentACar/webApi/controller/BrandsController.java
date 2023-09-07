package kodlama.io.rentACar.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/brands")
@AllArgsConstructor
public class BrandsController {

    private BrandService brandService;

    // @Autowired
    // public BrandsController(BrandService brandService) {
    //     this.brandService = brandService;
    // }

    @GetMapping("")
    public List<GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {
         brandService.add(createBrandRequest);
    }
    

}
