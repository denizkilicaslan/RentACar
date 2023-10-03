package kodlama.io.rentACar.business.rules;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.CarRepository;
import kodlama.io.rentACar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RentalBusinessRules {
    private CarRepository carRepository;

    public boolean checkIfCarAvaible(int id) {
        Car car = carRepository.findById(id).orElseThrow();
        if (car.getState() == 1) {
            return true;
        }
        throw new BusinessException("Car not avaible");
    }
    // 1 avaible
    // 2 rented
    // 3 under maintenance
}
