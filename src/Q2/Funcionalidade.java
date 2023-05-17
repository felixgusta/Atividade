package Q2;

public class Funcionalidade<T> {
	    private Node<T> head;
	    private int size;

	    public Funcionalidade() {
	        head = null;
	        size = 0;
	    }

	    public void Executar(T acao) {
	        Node<T> newNode = new Node<>(acao);
	        newNode.next = head;
	        head = newNode;
	        size++;
	    }

	    public void desfazer() {
	        if (head != null) {
	            T Desfeita = head.data;
	            head = head.next;
	            size--;
	            System.out.println("Ação desfeita: " + Desfeita);
	        }
	    }

	    public int getSize() {
	        return size;
	    }

	    private static class Node<T> {
	        private T data;
	        private Node<T> next;

	        public Node(T data) {
	            this.data = data;
	            next = null;
	        }
	    }
	}

	
	
