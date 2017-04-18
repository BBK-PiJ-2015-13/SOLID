/**
 * Created by Tom on 07/03/2017.
 */
public interface Sensor {
    boolean isTriggered();

    //returns true/false for whether the sensor is triggered or not.  Dif-
    //ferent sensors have different rules applied to them.
    String getLocation();

    //returns a description of the location of the sensor such as
           // Lobby
    //1st floor
    //or
    //In the auditorium

            String getSensorType();

    //returns a textual description of the sensor type such as
    //"Fire sensor"
    //or
    //"Smoke sensor"

    String getSensorCategory();
    //returns a textual description of the sensor category
    //Security sensor or Hazard sensor
}
