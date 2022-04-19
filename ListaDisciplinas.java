package Cadastro;

public class ListaDisciplinas 
{
	private No primeiro;
	private No ultimo;
	private int quantNo; //Vai mostrar a quantidade de no da lista
	
	
	public ListaDisciplinas() 
	{ 
		this.primeiro = null; //A lista nova não deve ter ninguém preenchido na primeira posição
		this.ultimo = null; //A lista nova não deve ter ninguém na última posição
		this.quantNo = 0;
	}//************método construtor para criar uma lista vazia


	public No getPrimeiro() 
	{
		return primeiro;
	}


	public void setPrimeiro(No primeiro) 
	{
		this.primeiro = primeiro;
	}


	public No getUltimo() 
	{
		return ultimo;
	}


	public void setUltimo(No ultimo) 
	{
		this.ultimo = ultimo;
	}


	public int getQuantNo() 
	{
		return quantNo;
	}//**********************toda vez que quiser saber a quantidade de No chama esse get


	public void setQuantNo(int quantNo) 
	{
		this.quantNo = quantNo;
	}
	
	//******************************************************************
	
	
	public boolean eVazia() 
	{
		return (this.primeiro == null); //se o primeiro lugar está vazio então é pq a lista está vazia
	}//método para saber se a lista está vazia
	
	
	//******************************************************************	
	
	public void inserirUltimo (Disciplina d) 
	{ //instanciou novo objeto do nó colocando como parâmetro a disciplina ** insere na ultima posição
		No novoNo = new No(d);//objeto No obs: toda vez que instaciamos um nó temos que preenchê-lo com algum parâmetro
		if(this.eVazia()) 
		{
			this.primeiro = novoNo;
		} 
		else 
		{
		this.ultimo.setProx(novoNo);
		} //se a lista não for vazia então o próximo do ultimo será a posição do novo No  
		
		this.ultimo = novoNo;
		this.quantNo++; 
	}//Método para inserir na ultima posição
	
	
	//******************************************************************

	
	public boolean removerNo (String nome) { //Metodo verdadeiro ou falso, tem como parametro a string da disciplina
        No atual = this.primeiro;//declarando um nó do tipo atual que recebe o primeiro nó
        No anterior = null;
        if(eVazia()) 
        {
            return false; //pq se ela for vazia não tem o que remover
        } 

        else 
        {
            while(( atual != null ) && (!atual.getD().getNome().equals(nome)) && (atual.getProx() != null))
            { //Se o atual que é o primeiro não for vazio e além disso não tiver o nome procurado
                anterior = atual;
                atual = atual.getProx(); //ou seja, vai passar para o próximo e dar andamento na busca pelo nome igual da disciplina
                
            }
            if((!atual.getD().getNome().equals(nome)) && (atual.getProx() == null)) 
            {//para o caso da disciplina digitada não combinar com nenhum item da lista 
            	return false;
            }
            else if ((atual == this.primeiro) && (atual.getD().getNome().equals(nome)))
            {
                if(this.primeiro == this.ultimo) 
                {
                    this.ultimo = null;
                }
                this.primeiro = this.primeiro.getProx();//já que o primeiro não é o ultimo da lista então ele é substituido pelo valor do proximo, sendo removido
            }
            else 
            {
                if(atual == this.ultimo) 
                {
                    this.ultimo = anterior; //para fazer a navegação
                }
                anterior.setProx(atual.getProx()); //o anterior aponta para o próximo do que era o atual, removendo assim o atual
            }
            this.quantNo--;
            return true;
        }
    }//remover No
	
	
	//******************************************************************
		
		public String pesquisarNo(String nome) 
		{
			String msg = "";
			No atual = this.primeiro;
			while((atual != null) && (!atual.getD().getNome().equals(nome))) 
			{
				atual = atual.getProx();
			}
			return msg = "Nome: " +atual.getD().getNome()+"\n"+
						 "Nota: " +atual.getD().getNota();			
		}//Metodo para pesquisar No
		
		public String imprimirLista() 
		{
			String msg="";
			if(eVazia()) 
			{
				msg="A lista está vazia!";
			} 
			else 
			{
				No atual = this.primeiro;
				while(atual != null) 
				{
					msg += "\n\n Disciplina: "+ atual.getD().getNome() + "\n Nota: "+ atual.getD().getNota();
                    atual = atual.getProx();
				}
			}
			return msg;
		} //Metodo para imprimir a lista de disciplinas
}	
