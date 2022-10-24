import java.util.Scanner;

public class C12_Ex10
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nomes[] = new String[50];
		double notas[] = new double[nomes.length];
		double media = 0;
		
		for(int i = 0; i < nomes.length; i++)
		{
			System.out.print("Informe o nome do(a) aluno(a): ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a nota do(a) aluno(a) " + nomes[i] + ": ");
			notas[i] = teclado.nextDouble();
			teclado.nextLine();
			
			media += notas[i];
		}
		
		media /= nomes.length;
		
		System.out.println("Aluno(s) acima da média:");
		
		for(int i = 0; i < nomes.length; i++)
		{
			if(notas[i] > media)
			{
				System.out.println(nomes[i]);
			}
		}
			
		teclado.close();
	}
}