package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.RentalService;
import kodlama.io.rentACar.business.requests.CreateRentalRequest;
import kodlama.io.rentACar.business.requests.UpdateRentalRequest;
import kodlama.io.rentACar.business.responses.GetAllRentalsResponse;
import kodlama.io.rentACar.business.responses.GetByIdRentalsResponse;
import kodlama.io.rentACar.business.rules.RentalBusinessRules;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.RentalRepository;
import kodlama.io.rentACar.entities.concretes.Rental;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RentalManager implements RentalService {

    private RentalRepository rentalRepository;
    private ModelMapperService modelMapperService;
    private RentalBusinessRules rentalBusinessRules;

    @Override
    public List<GetAllRentalsResponse> getAll() {
        List<Rental> rentals = rentalRepository.findAll();

        List<GetAllRentalsResponse> rentalsResponses = rentals.stream()
                .map(rental -> this.modelMapperService.forResponse()
                        .map(rental, GetAllRentalsResponse.class))
                .collect(Collectors.toList());

        return rentalsResponses;
    }

    @Override
    public void add(CreateRentalRequest createRentalRequest) {
        if (rentalBusinessRules.checkIfCarAvaible(createRentalRequest.getCarId())) {
            Rental rental = modelMapperService.forRequest().map(createRentalRequest, Rental.class);
            rentalRepository.save(rental);
        }
    }

    @Override
    public GetByIdRentalsResponse getById(int id) {
        Rental rental = rentalRepository.findById(id).orElseThrow();
        GetByIdRentalsResponse getByIdRentalsResponse = modelMapperService.forResponse()
                .map(rental, GetByIdRentalsResponse.class);
        return getByIdRentalsResponse;
    }

    @Override
    public void delete(int id) {
        rentalRepository.deleteById(id);
    }

    @Override
    public void update(UpdateRentalRequest updateRentalRequest) {
        Rental rentals = modelMapperService.forRequest().map(updateRentalRequest, Rental.class);
        rentalRepository.save(rentals);
    }
}
