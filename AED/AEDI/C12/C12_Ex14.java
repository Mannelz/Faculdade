import java.util.Scanner;

public class C12_Ex14
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nome[] = new String[100];
		String estado[] = new String[nome.length];
		int populacao[] = new int[nome.length];
		String tempNome, tempEstado;
		int tempPopulacao;
		
		for(int i = 0; i < nome.length; i++)
		{
			System.out.print("Informe o nome da cidade: ");
			nome[i] = teclado.nextLine();
			System.out.print("Informe o estado da cidade: ");
			estado[i] = teclado.nextLine();
			System.out.print("Informe a população da cidade: ");
			populacao[i] = teclado.nextInt();
			
			teclado.nextLine();
		}
		
		for(int i = 0; i < nome.length - 1; i++)
		{
			for(int j = 0; j < nome.length - 1; j++)
			{
				if(populacao[j] < populacao[j + 1])
				{
					tempPopulacao = populacao[j];
					populacao[j] = populacao[j + 1];
					populacao[j + 1] = tempPopulacao;
					
					tempNome = nome[j];
					nome[j] = nome[j + 1];
					nome[j + 1] = tempNome;
					
					tempEstado = estado[j];
					estado[j] = estado[j + 1];
					estado[j + 1] = tempEstado;
				}
			}
		}
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if(populacao[j] > populacao[j + 1])
				{
					tempPopulacao = populacao[j];
					populacao[j] = populacao[j + 1];
					populacao[j + 1] = tempPopulacao;
					
					tempNome = nome[j];
					nome[j] = nome[j + 1];
					nome[j + 1] = tempNome;
					
					tempEstado = estado[j];
					estado[j] = estado[j + 1];
					estado[j + 1] = tempEstado;
				}
			}
		}
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(nome[i] + " - " + estado[i]);
		}
		
		teclado.close();
	}
}