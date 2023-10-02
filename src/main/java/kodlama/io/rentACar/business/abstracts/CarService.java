package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateCarRequest;
import kodlama.io.rentACar.business.requests.UpdateCarRequest;
import kodlama.io.rentACar.business.responses.GetAllCarResponse;
import kodlama.io.rentACar.business.responses.GetByIdCarResponse;

public interface CarService {
    List<GetAllCarResponse> getAll();
    void add(CreateCarRequest createCarRequest);
    void update(UpdateCarRequest updateCarRequest);
    void delete(int id);

    GetByIdCarResponse getById (int id);
}
