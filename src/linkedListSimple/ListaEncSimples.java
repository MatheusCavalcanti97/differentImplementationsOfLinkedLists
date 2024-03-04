package linkedListSimple;

public class ListaEncSimples {

	private Node referencia;

	public ListaEncSimples() {
		this.referencia = null;
	}

	public void insertIntoList(int infomacao) { // inserir na lista
		Node newNode = new Node(infomacao, referencia);
		referencia = newNode;
	}

	public void exclude(int item) { // remover da lista
		if (emptyList()) { // verifica se a lista está vazia
			System.out.println("The List is Empty!");
			return;
		}

		if (item == referencia.getInfo()) { // verifica se o item para ser removido é o primeiro da lista
			referencia = referencia.getProximo();
			return;
		}

		for (Node assistant = referencia; assistant != null; assistant = assistant.getProximo()) {
			if (assistant.getProximo().getInfo() == item) {
				
				if (assistant.getProximo().getProximo() == null) {
					assistant.setProximo(null);
					return;
				}
				
				else if(assistant.getProximo().getProximo() != null) {
					assistant.setProximo(assistant.getProximo().getProximo());
				}
			}
		}
	}

	public String printsListElements() { // retorna a lista com todos elementos que estão ou não inseridos
		String a = "[ ";
		if (emptyList()) {
			System.out.println("The List is Empty!");
		}

		for (Node assistant = referencia; assistant != null; assistant = assistant.getProximo()) {
			a += assistant.getInfo() + " ";
		}

		a += "]";
		return a;
	}

	public boolean emptyList() { // verifica se a lista está vazia.
		return this.referencia == null;
	}

}
