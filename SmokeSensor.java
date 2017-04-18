import java.util.Random;

/**
 * Created by Tom on 07/03/2017.
 */
public class SmokeSensor implements BatterySensor {
    private int battery = 100;
    @Override
    public boolean isTriggered() {
        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;
        if (randNum > 10) {
            return false;
        } else {
            return true;
        }
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
        battery -= 20;
        return battery;
    }
}
