package listaEncadeadaSimples;

public class ListaEncSimples {

	private Node referencia;

	public ListaEncSimples() {
		this.referencia = null;
	}

	public void insertIntoList(int infomacao) { // inserir na lista
		Node newNode = new Node(infomacao, referencia);
		referencia = newNode;
	}

	public void remover(int item) { //remover da lista
		if (emptyList()) { // verifica se a lista está vazia
			System.out.println("The List is Empty!");
			return;
		}
		
		if(item == referencia.getInfo()) { // verifica se o item para ser removido é o primeiro da lista
			referencia = referencia.getProximo();
			return;
		}
		
		for(Node assistant = referencia; assistant != null; assistant = assistant.getProximo()) {
			if(assistant.getProximo().getInfo() == item) {
				if(assistant.getProximo().getProximo() == null) {
					assistant.setProximo(null);
					return;
				}
				assistant.setProximo(assistant.getProximo().getProximo());
			}
		}
	}

	public void printsListElements() { // retorna a lista com todos elementos que estão ou não inseridos
		if (emptyList()) {
			System.out.println("The List is Empty!");
		}

		for (Node assistant = referencia; assistant != null; assistant = assistant.getProximo()) {
			System.out.println(assistant.getInfo() + " ");
		}
		System.out.println();
	}

	public boolean emptyList() { // verifica se a lista está vazia.
		return this.referencia == null;
	}

}
