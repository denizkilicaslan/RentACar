package kodlama.io.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdCarResponse {
    private int id;

    private String plate;

    private double dailyPrice;

    private int modelYear;

    private int state; // 1-available 2-rented 3-maintence

    private int modelId;

    private  String imgUrl;
}
