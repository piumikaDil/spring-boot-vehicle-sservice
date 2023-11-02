package ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.service;

import ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.dto.VehicleDto;
import ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.entity.Vehicle;
import ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.exeption.InvalidException;
import ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.exeption.NotFoundException;
import ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.repository.VehicleRepository;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;
    @Autowired
    ModelMapper mapper;
    @Override
    public void saveVehicle(VehicleDto dto) {
        Vehicle testP = new Vehicle();
        Vehicle mapped = mapper.map(dto, Vehicle.class);
        mapped.setVehicleId(testP.getVehicleId());
        vehicleRepository.save(mapped);
    }

    @Override
    public void updateVehicle(VehicleDto dto) {
        if (vehicleRepository.existsById(dto.getVehicleID())){
            vehicleRepository.save(mapper.map(dto,Vehicle.class));
        }else {
            throw new NotFoundException("Please check the Vehicle ID..");
        }
    }

    @Override
    public void deleteVehicle(String id) {
        if (vehicleRepository.existsById(id)){
            vehicleRepository.deleteById(id);
        }else {
            throw  new NotFoundException("Id Does not Exist");
        }
    }

    @Override
    public List<VehicleDto> getAllVehicle() {
        return mapper.map(vehicleRepository.findAll(), new TypeToken<List<VehicleDto>>() {
        }.getType());
    }


    @Override
    public VehicleDto searchVehicle(String id) {
       if (!vehicleRepository.existsById(id)) throw new NotFoundException("Vehicle Does not exist");
        Vehicle vehicle = vehicleRepository.findById(id).get();
        return mapper.map(vehicle,VehicleDto.class);

    }
}
