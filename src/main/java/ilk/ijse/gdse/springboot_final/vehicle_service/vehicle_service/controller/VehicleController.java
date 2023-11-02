package ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.controller;

import ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.dto.VehicleDto;
import ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.service.VehicleService;
import ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/vehicle")
@CrossOrigin("*")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping(consumes =MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveVehicle( @RequestPart String vehicleBrand,
                                    @RequestPart String category, @RequestPart String fuelType,
                                    @RequestPart String fuelUsage, @RequestPart byte[] frontImage,
                                    @RequestPart byte[] backImage, @RequestPart byte[] sideImage,
                                    @RequestPart String seats , @RequestPart String transmissionType ,
                                    @RequestPart String driverName, @RequestPart String contactNo,
                                    @RequestPart byte[] license){

        Integer seatCapacity = Integer.parseInt(seats);

        VehicleDto vehicleDto = new VehicleDto(vehicleBrand, category, fuelType,
                fuelUsage, frontImage, backImage, sideImage, seatCapacity,
                transmissionType, driverName, contactNo, license);

        vehicleService.saveVehicle(vehicleDto);
        return new ResponseUtil(200,"Save Successfully",null);
    }

    @PutMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateVehicle(@RequestPart String vehicleId,@RequestPart String vehicleBrand,
                                      @RequestPart String category, @RequestPart String fuelType,
                                      @RequestPart String fuelUsage,@RequestPart byte[] frontImage,
                                      @RequestPart byte[] backImage,@RequestPart byte[] sideImage,
                                      @RequestPart String seats ,@RequestPart String transmissionType ,
                                      @RequestPart String driverName,@RequestPart String contactNo,
                                      @RequestPart byte[] license){

        Integer seatCapacity = Integer.parseInt(seats);

        VehicleDto vehicleDto = new VehicleDto(vehicleId,vehicleBrand, category, fuelType,
                fuelUsage, frontImage, backImage, sideImage, seatCapacity,
                transmissionType, driverName, contactNo, license);

        vehicleService.updateVehicle(vehicleDto);
        return new ResponseUtil(200,"Update Success",null);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllVehicle(){

//        List<VehicleDto> allVehicle = vehicleService.getAllVehicle();
        return new ResponseUtil(200,"Get All",vehicleService.getAllVehicle());
    }

    @DeleteMapping("/{id}")
    public ResponseUtil deleteVehicle(@PathVariable(value = "id") String id){
        vehicleService.deleteVehicle(id);
        return new ResponseUtil(200,"Delete Success",null);
    }


    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchVehicle(@PathVariable String id){
        VehicleDto vehicleDto = vehicleService.searchVehicle(id);
        return new ResponseUtil(200,"Search Success",vehicleDto);
    }
    @GetMapping("/{id}")
    public VehicleDto getOneVehicle(@PathVariable(value = "id") String id){
        return vehicleService.searchVehicle(id);
    }
}
