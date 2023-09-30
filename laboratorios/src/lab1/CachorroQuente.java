package lab1;

import java.util.ArrayList;

public abstract class CachorroQuente {

	protected String queijo;
	protected ArrayList<String> ingredientes;
	protected String bebiba;
	
	public CachorroQuente(String queijo) {
		this.queijo = queijo;		
	}
	
	public void adicionarIngredientes(String ingrediente) {
		
		ingredientes.add(ingrediente);
	}
}
