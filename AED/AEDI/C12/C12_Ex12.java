import java.util.Scanner;

public class C12_Ex12
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nomes[] = new String[50];
		double notas[] = new double[nomes.length];
		double maiorNota = 0;
		
		for(int i = 0; i < nomes.length; i++)
		{
			System.out.print("Informe o nome do(a) aluno(a): ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a nota do(a) aluno(a) " + nomes[i] + ": ");
			notas[i] = teclado.nextDouble();
			teclado.nextLine();
		}
		
		for(int i = 1; i < nomes.length; i++)
		{
			if(maiorNota <= notas[i])
			{
				maiorNota = notas[i];
			}	
		}
		
		System.out.println("Aluno(s) com maior nota: ");
		
		for(int i = 1; i < nomes.length; i++)
		{
			if(maiorNota == notas[i])
			{
				System.out.println(nomes[i]);
			}	
		}
		
		teclado.close();
	}
}