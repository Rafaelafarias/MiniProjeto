package Cadastro;

import java.util.Scanner;

public class Principal 
{

	public static char menu() 
	{
		String msg;
		System.out.println("------------------------------------------");
		System.out.println("            Escolha uma opção");
		System.out.println("------------------------------------------");
		System.out.println("1. Adicionar Disciplina");
		System.out.println("2. Excluir disciplina ");
		System.out.println("3. Ver quantidade de disciplinas adicionadas");
		System.out.println("4. Ver lista de disciplinas adicionadas");
		System.out.println("5. Voltar ao menu inicial");
		System.out.println("------------------------------------------");
		msg = new Scanner(System.in).next(); //scanner é uma classe, que quando estanciada pelo msg tornou-se um objeto. Vai captar o que foi digitado pelo usuário
		return msg.charAt(0);//vai retornar o primeiro caracter digitado pelo usuario
	}
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		ListaDisciplinas lista = new ListaDisciplinas();//objeto listaDisciplinas chamado de lista
		Disciplina d;
		char opcao; //que será a opção digitada pelo usuário
		
		do 
		{
			opcao = menu();
			switch(opcao) 
			{
			case '1':
				System.out.println("------------ Adicionando disciplina------------");
				d = new Disciplina();
				System.out.print("Disciplina : ");
				d.setNome(ler.next());
				System.out.print("Nota : ");
				d.setNota(ler.nextDouble());
				lista.inserirUltimo(d);
				break;
				
			case '2':
				if(lista.eVazia()) 
				{
					System.out.println("A lista está vazia");
				}
				else 
				{
					System.out.println("Excluir uma disciplina\nDigite o nome da disciplina: ");
					String nome = ler.next();
							
					if(lista.removerNo(nome)) 
					{
						System.out.println(nome+ " foi removido da lista de disciplinas com sucesso.");
					}	
					else
					{
						System.out.println("A disciplina não pode ser removida pois não consta na lista.");
					}
				}
				break;	
				
			case '3':
				System.out.println("A quantidade de disciplinas adicionadas foi "+ lista.getQuantNo());
				break;
				
			case '4':
				System.out.println("----------------------------------------------------------");
				System.out.println("Lista de disciplinas: "+ lista.imprimirLista());
				System.out.println("----------------------------------------------------------");	
				break;
				
			case '5':
				
				break;
				
			default:
				System.out.println("Opção inválida. Digite de acordo com as opções do menu.");
				break;
			
			}	
			
		}while (opcao != '5'); 
		
	}

}

