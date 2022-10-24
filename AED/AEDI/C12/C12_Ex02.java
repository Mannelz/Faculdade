import java.util.Scanner;

public class C12_Ex02
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int [10];
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe um número inteiro: ");
			num[i] = teclado.nextInt();
		}
		
		System.out.print("Valores maiores que 5 e menores que 10: ");
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] > 5 && num[i] < 10)
			{
				System.out.print(num[i] + " ");
			}
		}
		
		teclado.close();
	}
}