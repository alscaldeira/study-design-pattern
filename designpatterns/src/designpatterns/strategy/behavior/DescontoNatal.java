package designpatterns.strategy.behavior;

public class DescontoNatal implements DescontoStrategy {

	@Override
	public double calcularDesconto(double price) { 
		return price * 0.8; // 20% de desconto
	}

}
