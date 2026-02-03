package designpatterns.strategy;

import designpatterns.strategy.behavior.DescontoAnoNovo;
import designpatterns.strategy.behavior.DescontoNatal;
import designpatterns.strategy.behavior.SemDesconto;

public class Main {

	public static void main(String[] args) {
		CalculadoraDeDesconto calculadoraNatal = new CalculadoraDeDesconto(new DescontoNatal());
		double descontoNatal = calculadoraNatal.calcular(10);
		System.out.println(descontoNatal);

		CalculadoraDeDesconto calculadoraAnoNovo = new CalculadoraDeDesconto(new DescontoAnoNovo());
		double descontoAnoNovo = calculadoraAnoNovo.calcular(10);
		System.out.println(descontoAnoNovo);

		CalculadoraDeDesconto calculadoraSemDesconto = new CalculadoraDeDesconto(new SemDesconto());
		double semDesconto = calculadoraSemDesconto.calcular(10);
		System.out.println(semDesconto);
	}
	
}
