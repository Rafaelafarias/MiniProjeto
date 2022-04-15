   package Cadastro;

public class No 
{

	private Disciplina d; //a classe No tem um atributo chamado disciplina chamada d
	private No prox; //atributo No chamado prox para facilitar que vai apontar para o endereço do próximo nó
	
	public No (Disciplina di) 
	{ //É um método construtor, toda vez que criar um novo nó, vai ser preenchido com as informações das disciplinas 
		this.d = di; //this se refere a variável do método
		this.prox = null; 
	}

	public Disciplina getD() 
	{
		return d;
	}

	public void setD(Disciplina d) 
	{
		this.d = d;
	}

	public No getProx() 
	{
		return prox;
	}

	public void setProx(No prox) 
	{
		this.prox = prox;
	}
}
   