public class CheapBrand implements SensorBrand {
    /**
     * @author Bengisu Baglar 20180808061
     */

    @Override
    public TemperatureSensor createTemperatureSensor() {
        return new CheapTemperatureSensor();
    }

    @Override
    public HumiditySensor createHumiditySensor() {
        return new CheapHumiditySensor();
    }
    @Override
    public LightSensor createLightSensor() {
        return new CheapLightSensor();
    }
}
