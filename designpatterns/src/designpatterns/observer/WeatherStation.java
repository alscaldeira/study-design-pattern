package designpatterns.observer;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements IObservable, Runnable {
	
	public WeatherStation() {
		new Thread(this).start();
	}

	private volatile float temperature;
	private final List<IObserver> observers = new CopyOnWriteArrayList<>();
	private final Random random = new Random();
	
	@Override
	public void add(IObserver observer) {
		if (observer != null) {
			observers.add(observer);
		}
	}

	@Override
	public void remove(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (IObserver o : observers) {
			try {
				o.update();
			} catch (Exception e) {
				System.err.println("Error notifying observer: " + e.getMessage());
			}
		}
	}

	@Override
	public void run() {
		int updates = 0;
		while (updates < 4) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				break;
			}
			// set a new random temperature between -10.0 and 40.0
			temperature = -10 + random.nextFloat() * 50f;
			updates++;
			notifyObserver();
		}
	}

	public float getTemperature() {
		return temperature;
	}
	
	@Override
	public String toString() {
		return temperature + "°C";
	}
	
}