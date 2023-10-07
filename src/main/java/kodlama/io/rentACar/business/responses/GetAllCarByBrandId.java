package kodlama.io.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllCarByBrandId {
    private int id;

    private String plate;

    private double dailyPrice;

    private int modelYear;

    private int state; // 1-available 2-rented 3-maintence

    private int modelId;

    private String modelName;

    private  String imgUrl;
}