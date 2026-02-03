package designpatterns.strategy.behavior;

public class DescontoAnoNovo implements DescontoStrategy {

	@Override
	public double calcularDesconto(double price) {
		return price * 0.85; // 15% de desconto
	}
	
}
