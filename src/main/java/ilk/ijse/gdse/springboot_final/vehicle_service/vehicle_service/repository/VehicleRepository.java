package ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.repository;

import ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.entity.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle,String> {
}
