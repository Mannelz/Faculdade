import java.util.Scanner;

public class C12_Ex17
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int[10];
		int numInverso[] = new int [num.length];
		int cont = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe um número: ");
			num[i] = teclado.nextInt();
		}
		
		for(int i = num.length - 1; i >= 0; i--)
		{
			numInverso[cont] = num[i];
			cont++;
		}
		
		System.out.print("Vetor inverso: ");
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(numInverso[i] + " ");
		}
		
		teclado.close();
	}
}