public class MeteoStation{
	public static void main(String[] args){
		MeteoStore meteoDb = new MeteoStore();
		
		MeteoSensor ms200_1 = new MS200(1);
		meteoDb.save(ms200_1);

		// Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
		final ST500Info st500Info = ST500Info();
		final AdapterSensorTemperature adapterSensor =
				AdapterSensorTemperature(st500Info.getData());
		meteoDb.save(adapterSensor);
	}
}