package designpatterns.observer;

public class DigitalWatch implements IObserver {
	
	public DigitalWatch(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}
	
	private WeatherStation weatherStation;

	@Override
	public void update() {
		System.out.println("Update digital watch: " + weatherStation.toString());
	}

}
