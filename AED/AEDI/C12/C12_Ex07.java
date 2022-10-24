import java.util.Scanner;

public class C12_Ex07
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nomes[] = new String[50];
		double notas[] = new double[nomes.length];
		String conceitos[] = new String[nomes.length];
		
		for(int i = 0; i < nomes.length; i++)
		{
			System.out.print("Informe o nome do(a) aluno(a): ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a nota do(a) aluno(a) " + nomes[i] + ": ");
			notas[i] = teclado.nextDouble();
			teclado.nextLine();
			
			if(notas[i] <= 30)
			{
				conceitos[i] = "D";
			}
			else if(notas[i] <= 60)
			{
				conceitos[i] = "C";
			}
			else if(notas[i] <= 80)
			{
				conceitos[i] = "B";
			}
			else
			{
				conceitos[i] = "A";
			}
		}
		
		for(int i = 0; i < nomes.length; i++)
		{
			System.out.println("Aluno(a): " + nomes[i] + "\nConceito: " + conceitos[i]);
		}
		
		teclado.close();
	}
}