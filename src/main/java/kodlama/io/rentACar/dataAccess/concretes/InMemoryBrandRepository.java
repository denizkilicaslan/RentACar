package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

public class InMemoryBrandRepository implements BrandRepository{


    ArrayList<Brand> brands;

    public InMemoryBrandRepository(){

        brands=new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(1, "Mercedes"));
        brands.add(new Brand(1, "Fiat"));
        brands.add(new Brand(1, "Audi"));

    }


    @Override
    public List<Brand> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    
}
