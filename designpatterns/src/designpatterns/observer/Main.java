package designpatterns.observer;

public class Main {

	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		
		PhoneWeatherApp phoneWeatherApp = new PhoneWeatherApp(weatherStation);
		DigitalWatch digitalWatch = new DigitalWatch(weatherStation);
		
		weatherStation.add(phoneWeatherApp);
		weatherStation.add(digitalWatch);
	}
	
}
