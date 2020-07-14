import comportamental.TemplateMethod.Damas;
import comportamental.TemplateMethod.Gamao;
import comportamental.TemplateMethod.Jogo;
import comportamental.TemplateMethod.Xadrez;

public class Principal {
	public static void main(String[] args) {
		Xadrez xadrez = new Xadrez();
		Damas damas = new Damas();
		Gamao gamao = new Gamao();
		
		Jogo jogo = new Xadrez();
		jogo.templateMethod();
		
		System.out.println();
		
		jogo = new Damas();
		jogo.templateMethod();
		
		System.out.println();
		
		jogo = new Gamao();
		jogo.templateMethod();
		
	}
}
