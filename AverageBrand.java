public class AverageBrand implements SensorBrand{
    /**
     * @author Bengisu Baglar 20180808061
     */

    @Override
    public TemperatureSensor createTemperatureSensor() {
        return new AverageTemperatureSensor();
    }

    @Override
    public HumiditySensor createHumiditySensor() {
        return new AverageHumiditySensor();
    }
    @Override
    public LightSensor createLightSensor() {
        return new AverageLightSensor();
    }
}
