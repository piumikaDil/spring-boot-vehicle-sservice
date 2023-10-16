package ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.exeption;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){
        super(message);
    }
}
