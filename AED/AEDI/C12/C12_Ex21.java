import java.util.Scanner;

public class C12_Ex21
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int [20];
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe um número inteiro: ");
			num[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < num.length; i++)
		{
			if((i + 1) % 2 != 0)
			{
				
				System.out.print(num[i] + " ");
			}
		}
		
		for(int i = 0; i < num.length; i++)
		{
			if((i + 1) % 2 == 0)
			{
				System.out.print(num[i] + " ");
			}
		}
		
		teclado.close();
	}
}