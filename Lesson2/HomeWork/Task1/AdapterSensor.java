import java.time.*;

public class AdapterSensorTemperature: MeteoSensor  {
    private SensorTemperature sensor;

    public AdapterSensorTemperature(SensorTemperature sensorTemperature) {
        this.sensor = sensorTemperature
    }

    public int getId() {
        return sensorTemperature.identifier();
    }
    public Float getTemperature() {
        return (float)sensor.temperature();
    }
    public Float getHumidity() {
            return (float)0;
    }
    public Float getPressure() {
        return (float)0;
    }
    public LocalDateTime getDateTime() {
        return LocalDateTime.of(sensor.year(), 1, 1, 0, 0, 0).plusDays(sensor.day()-1).plusSeconds(sensor.second());
    }
}