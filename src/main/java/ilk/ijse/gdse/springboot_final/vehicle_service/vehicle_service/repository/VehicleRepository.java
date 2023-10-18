package ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.repository;

import ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,String> {
}
