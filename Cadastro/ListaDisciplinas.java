package Cadastro;

public class ListaDisciplinas {
	private No primeiro;
	private No ultimo;
	private int quantNo; //Vai mostrar a quantidade de no da lista
	
	
	public ListaDisciplinas() { 
		this.primeiro = null; //A lista nova n�o deve ter ningu�m preenchido na primeira posi��o
		this.ultimo = null; //A lista nova n�o deve ter ningu�m na �ltima posi��o
		this.quantNo = 0;
	}//************m�todo construtor para criar uma lista vazia


	public No getPrimeiro() {
		return primeiro;
	}


	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}


	public No getUltimo() {
		return ultimo;
	}


	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}


	public int getQuantNo() {
		return quantNo;
	}//**********************toda vez que quiser saber a quantidade de No chama esse get


	public void setQuantNo(int quantNo) {
		this.quantNo = quantNo;
	}
	
	//******************************************************************
	
	
	public boolean eVazia() {
		return (this.primeiro == null); //se o primeiro lugar est� vazio ent�o � pq a lista est� vazia
	}//m�todo para saber se a lista est� vazia
	
	//******************************************************************
	
	/*
	public void inserirPrimeiro(Disciplina d) {
		No novoNo = new No(d);//objeto No que recebe o parametro o atributo d, que � do tipo Disciplina
		if(this.eVazia()) {
			this.ultimo = novoNo;
		} //Se ela estiver vazia ent�o a primeira posi��o tamb�m � a ultima
		novoNo.setProx(this.primeiro); //j� que o primeiro espa�o foi preenchido com o novoNo, ent�o o pr�ximo espa�o ser� a nova primeira posi��o
		this.primeiro = novoNo;
		this.quantNo++; //Vai acrescentando a cada nova forma��o de No
	}//m�todo para inserir na primeira posi��o
	
	*/
	//******************************************************************
	
	
	public void inserirUltimo (Disciplina d) { //instanciou novo objeto do n� colocando como par�metro a disciplina ** insere na ultima posi��o
		No novoNo = new No(d);//objeto No obs: toda vez que instaciamos um n� temos que preench�-lo com algum par�metro
		if(this.eVazia()) {
			this.primeiro = novoNo;
		} 
		else {
		this.ultimo.setProx(novoNo);} //se a lista n�o for vazia ent�o o pr�ximo do ultimo ser� a posi��o do novo No  
		
		this.ultimo = novoNo;
		this.quantNo++; 
	}//M�todo para inserir na ultima posi��o
	
	
	//******************************************************************
	
	public boolean removerNo (String nome) { //Metodo verdadeiro ou falso, tem como parametro a string da disciplina
		No atual = this.primeiro;//declarando um n� do tipo atual que recebe o primeiro n�
		No anterior = null;
		if(eVazia()) {
			return false; //pq se ela for vazia n�o tem o que remover
		} else {
			while((atual != null) && (!atual.getD().getNome().equals(nome)));{ //Se o atual que � o primeiro n�o for vazio e al�m disso n�o tiver o nome procurado
				anterior = atual;
				atual = atual.getProx(); //ou seja, vai passar para o pr�ximo e dar andamento na busca pelo nome igual da disciplina
			}
			
			if (atual == this.primeiro) {
				if(this.primeiro == this.ultimo) {
					this.ultimo = null;
				}
				this.primeiro = this.primeiro.getProx();//j� que o primeiro n�o � o ultimo da lista ent�o ele � substituido pelo valor do proximo, sendo removido
			}else {
				if(atual == this.ultimo) {
					this.ultimo = anterior; //para fazer a navega��o
				}
				anterior.setProx(atual.getProx()); //o anterior aponta para o pr�ximo do que era o atual, removeendo assim o atual
			}
			this.quantNo--;
			return true;}
		}//remover No
	
	//*****************************************************************
		
		public String pesquisarNo(String nome) {
			String msg = "";
			No atual = this.primeiro;
			while((atual != null) && (!atual.getD().getNome().equals(nome))) {
				atual = atual.getProx();
			}
			return msg = "Nome: " +atual.getD().getNome()+"\n"+
						 "Nota: " +atual.getD().getNota();			
		}//Metodo para pesquisar No
		
		public String imprimirLista() {
			String msg="";
			if(eVazia()) {
				msg="A lista est� vazia!";
			} else {
				No atual = this.primeiro;
				while(atual != null) {
					msg += atual.getD().getNome() + " -> ";
					atual = atual.getProx();
				}
			}
			return msg;
		} //Metodo para imprimir a lista de disciplinas
	
	
	
	
}	
