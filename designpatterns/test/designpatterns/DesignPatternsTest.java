package designpatterns;

import designpatterns.decorator.*;
import designpatterns.observer.*;
import designpatterns.singleton.*;
import designpatterns.strategy.*;
import designpatterns.strategy.behavior.*;

public class DesignPatternsTest {

    public static void main(String[] args) {
        try {
            DesignPatternsTest test = new DesignPatternsTest();
            test.decoratorTest();
            test.observerTest();
            test.strategyTest();
            test.singletonTest();
            System.out.println("Todos os testes passaram!");
        } catch (Exception e) {
            System.err.println("Teste falhou: " + e.getMessage());
            System.exit(1);
        }
    }

    void decoratorTest() {
        double cost = new Caramel(new Expresso()).cost();
        if (cost <= 0) throw new RuntimeException("Custo do Expresso inválido");
    }

    void strategyTest() {
        CalculadoraDeDesconto calc = new CalculadoraDeDesconto(new DescontoNatal());
        double valor = calc.calcular(100);
        if (valor == 100) throw new RuntimeException("Estratégia de desconto não aplicada");
    }

    void singletonTest() {
        if (Database.getInstance() != Database.getInstance()) {
            throw new RuntimeException("Singleton falhou: instâncias diferentes");
        }
    }
    
    void observerTest() {
		WeatherStation weatherStation = new WeatherStation();
		PhoneWeatherApp phoneWeatherApp = new PhoneWeatherApp(weatherStation);
		DigitalWatch digitalWatch = new DigitalWatch(weatherStation);
		weatherStation.add(phoneWeatherApp);
		weatherStation.add(digitalWatch);
		
		weatherStation.setTemperature(25);
		
		if (phoneWeatherApp.getTemperature() != digitalWatch.getTemperature()) {
			throw new RuntimeException("Observer falhou: temperaturas diferentes");
		}
		
    }
}
