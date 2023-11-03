package ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "vehicle")
public class Vehicle {
    @Id
    private String vehicleId = "V-" + UUID.randomUUID().toString().replace("-", "").substring(0, 4);
    private String vehicleBrand;
    private String category;
    private String fuelType;
    private String fuelUsage;
    private double fee_for_day;
    private double fee_for_km;

    private byte[] vehicleImageFront;

    private byte[] vehicleImageBack;

    private byte[] vehicleImageSide;
    private Integer seatCapacity;
    private String transmissionType;
    private String driverName;
    private String contactNo;

    private byte[] licenseImage;
}
