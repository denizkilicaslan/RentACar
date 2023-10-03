package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "plate")
    private String plate;

    @Column(name = "dailyPrice")
    private double dailyPrice;

    @Column(name = "modelYear")
    private int modelYear;

    @Column(name = "state")
    private int state;

    //?
    @OneToMany(mappedBy = "car")
    private List<Maintenance> maintenanceList;

    @OneToMany(mappedBy = "car")
    private List<Rental> rentalList;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    //    @ManyToOne()
    //    @JoinColumn(name = "maintenance_id")
    //    private Maintenance maintenance; // 1-available 2-rented 3-maintence
}
