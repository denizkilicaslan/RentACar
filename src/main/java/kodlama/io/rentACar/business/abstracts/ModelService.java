package kodlama.io.rentACar.business.abstracts;

import java.util.List;
import kodlama.io.rentACar.business.requests.CreateModelRequest;
import kodlama.io.rentACar.business.requests.UpdateCarRequest;
import kodlama.io.rentACar.business.responses.GetAllCarResponse;
import kodlama.io.rentACar.business.responses.GetAllModelsResponse;
import kodlama.io.rentACar.business.responses.GetByIdCarResponse;

public interface ModelService {

    List<GetAllModelsResponse> getAll();

    void add(CreateModelRequest createModelRequest);

}
