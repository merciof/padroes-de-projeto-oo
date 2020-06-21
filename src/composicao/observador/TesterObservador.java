package composicao.observador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesterObservador {

	@Test
	public void alteracaoEstado() {
		Assunto assunto = new Assunto();
		//assunto.setEstado(0);
		assertEquals(0, assunto.getEstado());
	}
	
	@Test
	public void adicionarUmObservador() {
		Assunto assunto = new Assunto();
		Observador observador = new Binario();
		assunto.adicionarObservador(observador);
		assertEquals(1, assunto.observadores.size());
	}
	
	@Test
	public void removerUmObservador() {
		Assunto assunto = new Assunto();
		Observador observador = new Binario();
		assunto.adicionarObservador(observador);
		assertEquals(1, assunto.observadores.size());
		assunto.removerObservador(observador);
		assertEquals(0, assunto.observadores.size());
		
	}
	
	

}
