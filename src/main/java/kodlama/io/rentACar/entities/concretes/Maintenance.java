package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Table(name = "maintenance")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Maintenance {
    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "startDate",updatable = false)
    private Date startDate;

    @Column(name = "returnDate")
    private Date returnDate;


    //@Column(name = "car_id")
    @ManyToOne()
    @JoinColumn(name = "carId")
    private Car car;

    //onetoone


}
