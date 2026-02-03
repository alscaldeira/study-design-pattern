package designpatterns.strategy.behavior;

public class SemDesconto implements DescontoStrategy{

	@Override
	public double calcularDesconto(double price) {
		return price;
	}

}
