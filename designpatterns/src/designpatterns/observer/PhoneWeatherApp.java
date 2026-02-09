package designpatterns.observer;

public class PhoneWeatherApp implements IObserver {
	
	public PhoneWeatherApp(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}
	
	private WeatherStation weatherStation;

	@Override
	public void update() {
		System.out.println("Update phone weather app: " + weatherStation.toString());
	}

}
