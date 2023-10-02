package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.entities.concretes.Brand;

//Dao 
// @Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {

    // List<Brand> getAll();
    boolean existsByName(String name); //spring jpa keywords 
}
