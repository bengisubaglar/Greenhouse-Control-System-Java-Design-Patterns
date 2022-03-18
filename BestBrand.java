public class BestBrand implements SensorBrand {
    /**
     * @author Bengisu Baglar 20180808061
     */

    @Override
    public TemperatureSensor createTemperatureSensor() {
        return new BestTemperatureSensor();
    }

    @Override
    public HumiditySensor createHumiditySensor() {

        return new BestHumiditySensor();
    }

    @Override
    public LightSensor createLightSensor(){
        return  new BestLightSensor();
    }
}
