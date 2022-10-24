import java.util.Scanner;

public class C12_Ex11
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nomes[] = new String[50];
		double notas[] = new double[nomes.length];
		String alunoMaiorNota = null;
		double maiorNota = 0;
		
		for(int i = 0; i < nomes.length; i++)
		{
			System.out.print("Informe o nome do(a) aluno(a): ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a nota do(a) aluno(a) " + nomes[i] + ": ");
			notas[i] = teclado.nextDouble();
			teclado.nextLine();
			
			if(i == 0 || maiorNota < notas[i])
			{
				maiorNota = notas[i];
				alunoMaiorNota = nomes[i];
			}	
		}
			
		System.out.println("Aluno(a) com maior nota: " + alunoMaiorNota);
		
		teclado.close();
	}
}