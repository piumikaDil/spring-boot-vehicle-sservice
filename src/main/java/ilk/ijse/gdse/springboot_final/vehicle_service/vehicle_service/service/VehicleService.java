package ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.service;

import ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.dto.VehicleDto;

import java.util.List;

public interface VehicleService {

    void saveVehicle(VehicleDto dto);
    void updateVehicle(VehicleDto dto);
    void deleteVehicle(String id);
    List<VehicleDto> getAllVehicle();
    VehicleDto searchVehicle(String id);
VehicleDto getOneselectedVehivle(String vehicleBrand);


}
