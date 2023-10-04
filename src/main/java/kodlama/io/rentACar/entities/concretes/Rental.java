package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "rentals")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "rantedForDays")
    private int rantedForDays;

    @Column(name = "startedDate")
    private Date startedDate;

    @ManyToOne()
    @JoinColumn(name = "carId")
    private Car car;

    @OneToOne(mappedBy = "rental")
    private Payment payment;

    @Column(name = "paid")
    boolean paid = false;

    @ManyToOne()
    @JoinColumn(name="rental_id")
    private BaseCustomer baseCustomer;



}
