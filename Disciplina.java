package Cadastro;

public class Disciplina 
{
	private String nome; // atributos da classe disciplina 
	private double nota; // devem ser privados para que não sejam acessados fora da classe sem ser pelo metodo get
	
	 
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public double getNota() 
	{
		return nota;
	}
	public void setNota(double nota) 
	{
		this.nota = nota;
	}	
}
