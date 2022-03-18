public interface SensorBrand {
    /**
     * @author Bengisu Baglar 20180808061
     */


    TemperatureSensor createTemperatureSensor();
    HumiditySensor createHumiditySensor();
    LightSensor createLightSensor();

}
