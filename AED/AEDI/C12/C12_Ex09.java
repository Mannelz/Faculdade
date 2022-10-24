import java.util.Scanner;

public class C12_Ex09
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int [10];
		int soma = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe um número inteiro: ");
			num[i] = teclado.nextInt();
			
			soma += num[i];
		}
		
		System.out.print("Divisores da soma: ");
		
		for(int i = 0; i < num.length; i++)
		{
			if(soma % num[i] == 0)
			{
				System.out.print(num[i] + " ");
			}
		}
		
		teclado.close();
	}
}