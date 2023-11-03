package ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDto {
    private String vehicleID;
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

    public VehicleDto(String vehicleBrand, String category, String fuelType, String fuelUsage, double fee_for_day, double fee_for_km, byte[] vehicleImageFront, byte[] vehicleImageBack, byte[] vehicleImageSide, Integer seatCapacity, String transmissionType, String driverName, String contactNo, byte[] licenseImage) {
        this.vehicleBrand = vehicleBrand;
        this.category = category;
        this.fuelType = fuelType;
        this.fuelUsage = fuelUsage;
        this.fee_for_day = fee_for_day;
        this.fee_for_km = fee_for_km;
        this.vehicleImageFront = vehicleImageFront;
        this.vehicleImageBack = vehicleImageBack;
        this.vehicleImageSide = vehicleImageSide;
        this.seatCapacity = seatCapacity;
        this.transmissionType = transmissionType;
        this.driverName = driverName;
        this.contactNo = contactNo;
        this.licenseImage = licenseImage;
    }
}
