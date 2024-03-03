package listaEncadeadaSimples;

public class Node {

	private int info;
	private Node proximo;
	
	public Node() {}
	
	public Node(int info, Node proximo) {
		this.info = info;
		this.proximo = proximo;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

}
