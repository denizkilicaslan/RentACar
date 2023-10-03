package kodlama.io.rentACar.business.rules;

import kodlama.io.rentACar.dataAccess.abstracts.CarRepository;
import kodlama.io.rentACar.dataAccess.abstracts.RentalRepository;
import kodlama.io.rentACar.entities.concretes.Car;
import kodlama.io.rentACar.entities.concretes.Rental;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentBusinessRules {
    private CarRepository carRepository;
    private RentalRepository rentalRepository;

    public double calculateTotalPrice(int id) {
        Rental rental = rentalRepository.findById(id).orElseThrow();
        Car car = carRepository.findById(rental.getCar().getId()).orElseThrow();
        double totalPrice = rental.getRantedForDays() * car.getDailyPrice();
        return totalPrice;
    }
}
