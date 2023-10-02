package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Integer> {
}
