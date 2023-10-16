package ilk.ijse.gdse.springboot_final.vehicle_service.vehicle_service.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseUtil {

    private Integer code;
    private String message;
    private Object data;
}
