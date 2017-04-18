/**
 * Created by Tom on 18/04/2017.
 */
public interface BatterySensor extends Sensor {
    int getBatteryPercentage();
    //:
    //Returns a number between 0-100 where 0 is empty and
    //100 is fully charged
}
