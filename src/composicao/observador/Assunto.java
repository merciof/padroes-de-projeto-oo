package composicao.observador;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author merciof
 *
 */
public class Assunto {
	
	private int estado;
	public List<Observador> observadores;
	
	public Assunto() {
		super();
		this.estado = 0;
		this.observadores = new ArrayList();
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
		notificarObservadores();
	}

	public void adicionarObservador(Observador observador) {
		observadores.add(observador);
		
	}

	public void removerObservador(Observador observador) {
		observadores.remove(observador);
		
	}
	
	public void notificarObservadores() {
		for (Observador observador : observadores) {
			observador.atualizar();
		}
	}
}

