import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 08/03/2017.
 */
    import java.util.ArrayList;
    import java.util.List;

    public class ControlUnit {

        private List<Sensor> sensors = new ArrayList<Sensor>();

        public ControlUnit(List<Sensor> mySensors) {
            sensors = mySensors;
        }

        public void pollSensors() {
            //List<Sensor> sensors = new ArrayList<Sensor>();
            sensors.add(new FireSensor());
            sensors.add(new SmokeSensor());

            for (Sensor sensor : sensors) {
                if (sensor.isTriggered()) {
                    System.out.println("A " + sensor.getSensorType() + " sensor was triggered at " + sensor.getLocation());
                } else {
                    System.out.println("Polled " + sensor.getSensorType() + " at " + sensor.getLocation() + " successfully");
                }
            }
        }
    }
