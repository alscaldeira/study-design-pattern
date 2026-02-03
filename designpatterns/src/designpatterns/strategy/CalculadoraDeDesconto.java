package designpatterns.strategy;

import designpatterns.strategy.behavior.DescontoStrategy;

public class CalculadoraDeDesconto {

	public CalculadoraDeDesconto(DescontoStrategy descontoStrategy) {
		this.descontoStrategy = descontoStrategy;
	}
	
	private DescontoStrategy descontoStrategy;
	
	public double calcular(double price) {
		return descontoStrategy.calcularDesconto(price);
	}

}
