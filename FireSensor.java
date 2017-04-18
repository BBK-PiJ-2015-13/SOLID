/**
 * Created by Tom on 07/03/2017.
 */
import java.util.Random;
public class FireSensor implements BatterySensor {
    private int battery = 100;
    @Override
    public boolean isTriggered() {
        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;
        if (randNum > 5) {
            return false;
        } else {
            return true;
        }
    }

    public Alarm callFireDept = new AlarmFire();

    public void fireCall() {
        callFireDept.sendAlarm();
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public String getSensorType() {
        return null;
    }

    @Override
    public String getSensorCategory() {
        return null;
    }

    @Override
    public int getBatteryPercentage() {
        battery -= 10;
        return battery;
    }
}
