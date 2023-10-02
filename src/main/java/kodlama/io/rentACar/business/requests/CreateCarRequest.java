package kodlama.io.rentACar.business.requests;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import kodlama.io.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {
    private String plate;

    private double dailyPrice;

    private int modelYear;

    private int state; // 1-available 2-rented 3-maintence

    private int modelId;
}
