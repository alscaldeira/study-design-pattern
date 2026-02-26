package designpatterns.observer;

public class PhoneWeatherApp implements IObserver {
	
	public PhoneWeatherApp(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}
	
	private WeatherStation weatherStation;
	private double temperature;

	@Override
	public void update() {
		this.temperature = weatherStation.getTemperature();
	}
	
	public double getTemperature() {
		return this.temperature;
	}

}
