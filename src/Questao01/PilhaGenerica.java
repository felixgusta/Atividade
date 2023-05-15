package Questao01;

import java.util.List;
import java.util.ArrayList;

public class PilhaGenerica <T>{
	private List<T> pilha = new ArrayList<>();
	
	public void push(T elemento) {
		pilha.add(elemento);
//		adicona um item na pilha
		
	}
	public T pop() {
		 if (pilha.isEmpty()) {
	            throw new IllegalStateException("A pilha está vazia.");
//	    olha se a lista esta vazia
	        }
	        return pilha.get(pilha.size() - 1);
	        
//	     remove "o ultimo elemento da pilha"
	    }
	public boolean isEmpty() {
		return pilha.isEmpty();
//		 indicando se a pilha está vazia ou não.
		
		
		
	}
}

