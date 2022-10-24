import java.util.Scanner;

public class C12_Ex03
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int[10];
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe um número inteiro: ");
			num[i] = teclado.nextInt();
		}
		
		System.out.print("Divisores de 34: ");
		
		for(int i = 0; i < num.length; i++)
		{
			if(34 % num[i] == 0)
			{
				System.out.print(num[i] + " ");
			}
		}
		
		teclado.close();
	}
}