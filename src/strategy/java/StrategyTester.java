package strategy.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StrategyTester {
	
	
	Cliente _cliente;

	@Before
	public void criacaoCalculadora() {
		_cliente = new Cliente();
	}
	
	
	@Test
	public void EstrategiaUm() {
		Calculadora algoritmo = new AlgoritmoUm();
		_cliente.setAlgoritmo(algoritmo);
		assertEquals("Executando algoritmo um.", _cliente.calcular());
	}
	
	@Test
	public void EstrategiaDois() {
		Calculadora algoritmo = new AlgoritmoDois();
		_cliente.setAlgoritmo(algoritmo);
		assertEquals("Executando algoritmo dois.", _cliente.calcular());
	}
	
	
	
	

}
