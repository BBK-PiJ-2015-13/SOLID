/**
 * Created by Tom on 18/04/2017.
 */
public interface Alarm {
    void sendAlarm();
    //Sends alarm notification
    boolean testAlarm(Alarm x);
    //tests whether alarm has been triggered or not
}
