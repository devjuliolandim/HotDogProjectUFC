package lab1;
import java.util.ArrayList;

public class Venda {

	private Aluno aluno;
	private ArrayList<CachorroQuente> cachorrosQuentes;
	
	
	public Venda(Aluno aluno) {
		this.aluno= aluno;
		cachorrosQuentes = new ArrayList<CachorroQuente>();
	}
	
	public void realizarVenda(CachorroQuente c) {
		cachorrosQuentes.add(c);
	}

	public Aluno getAluno() {
		return aluno;
	}

	public ArrayList<CachorroQuente> getCachorrosQuentes() {
		return cachorrosQuentes;
	}
	
	
}
