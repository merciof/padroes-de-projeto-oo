package strategy.groovy

import static org.junit.Assert.*

import org.junit.Before
import org.junit.Test

public class StrategyTester {

	Calculadora _algoritmo;
	Cliente _cliente;
	
	@Before
	public void criacaoObjetos() {
		_algoritmo = new AlgoritmoUm();
		_cliente = new Cliente();
		
	}
	
	@Test
	public void AlgoritmoUm() {
		_algoritmo = new AlgoritmoUm();
		_cliente.setAlgoritmo(_algoritmo);
		assertEquals("Executando algoritmo Um!", _cliente.calcular())
	}
	
	@Test
	public void AlgoritmoDois() {
		_algoritmo = new AlgoritmoDois();
		_cliente.setAlgoritmo(_algoritmo);
		assertEquals("Executando algoritmo Dois!", _cliente.calcular())
	}
	
	
	
	
	
}
