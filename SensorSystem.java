import java.util.Enumeration;
import java.util.Vector;
/**
 * @author Bengisu Baglar 20180808061
 */
public class SensorSystem {
    private Vector farmers = new Vector();

    public void register(SensorAlarm sensorAlarm){
        farmers.addElement(sensorAlarm);
    }

    public void notifyFarmers(){
        for(Enumeration e = farmers.elements();e.hasMoreElements();){
            ((SensorAlarm) e.nextElement()).triggered();
        }
    }
}
