   package Cadastro;

public class No {

	private Disciplina d; //a classe No tem um atributo chamado disciplina chamada d
	private No prox; //atributo No chamado prox para facilitar que vai apontar para o endere�o do pr�ximo n�
	
	public No (Disciplina di) { //� um m�todo construtor, toda vez que criar um novo n�, vai ser preenchido com as informa��es das disciplinas 
		this.d = di; //this se refere a vari�vel do m�todo
		this.prox = null; 
	}

	public Disciplina getD() {
		return d;
	}

	public void setD(Disciplina d) {
		this.d = d;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}
	
	
}
   