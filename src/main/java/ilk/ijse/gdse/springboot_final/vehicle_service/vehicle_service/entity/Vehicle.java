package ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Vehicle {
    @Id
    private String vehicleId;
    private String vehicleBrand;
    private String category;
    private String fuelType;
    private String fuelUsage;
    @Lob
    @Column(nullable = false,columnDefinition = "LONGBLOB")
    private byte[] vehicleImageFront;
    @Lob
    @Column(nullable = false,columnDefinition = "LONGBLOB")
    private byte[] vehicleImageBack;
    @Lob
    @Column(nullable = false,columnDefinition = "LONGBLOB")
    private byte[] vehicleImageSide;
    private Integer seatCapacity;
    private String transmissionType;
    private String driverName;
    private String contactNo;
    @Lob
    @Column(nullable = false,columnDefinition = "LONGBLOB")
    private byte[] licenseImage;
}
