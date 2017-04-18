import java.util.List;

/**
 * Created by Tom on 18/04/2017.
 */
import java.util.Calendar;
public class SecurityControlUnit extends ControlUnit {
    public SecurityControlUnit(List<Sensor> mySensors) {
        super(mySensors);
    }
    public void pollSensors() {
        Calendar cal = Calendar.getInstance();
        if (cal.get(Calendar.HOUR_OF_DAY) > 22 || cal.get(Calendar.HOUR_OF_DAY) < 6) {
            super.pollSensors();
        }
    }
}
