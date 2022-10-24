import java.util.Scanner;

public class C12_Ex23
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int [10];
		int numDiv3[] = new int [num.length];
		int cont = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe um número inteiro: ");
			num[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 3 == 0)
			{
				numDiv3[cont] = num[i];
				cont++;
			}
		}
		
		System.out.print("Divisível por 3: ");
		
		for(int i = 0; i < cont; i++)
		{
			System.out.print(numDiv3[i] + " ");
		}
		
		teclado.close();
	}
}