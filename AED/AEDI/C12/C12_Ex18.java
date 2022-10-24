import java.util.Scanner;

public class C12_Ex18
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nome[] = new String [10];
		String nomeSearch;
		int pos = -1;
		
		for(int i = 0; i < nome.length; i++)
		{
			System.out.print("Informe o nome: ");
			nome[i] = teclado.nextLine();
		}
		
		System.out.print("Informe o nome que deseja procurar: ");
		nomeSearch = teclado.nextLine();
		
		for(int i = 0; i < nome.length; i++)
		{
			if(nome[i].compareToIgnoreCase(nomeSearch) == 0)
			{
				pos = i;
			}
		}
		
		if(pos != -1)
		{
			System.out.println(nomeSearch + " encontrado na posição " + (pos + 1));
		}
		else
		{
			System.out.println("Nome não encontrado.");
		}
		
		teclado.close();
	}
}