package ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.exeption;

public class InvalidException extends RuntimeException{
    public InvalidException(String message){
        super(message);
    }
}
