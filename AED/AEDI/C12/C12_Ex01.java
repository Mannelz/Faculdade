import java.util.Scanner;

public class C12_Ex01
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int [10], contDiv = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe um número: ");
			num[i] = teclado.nextInt();
			
			if(num[i] % 5 == 0 && num[i] % 7 == 0)
			{
				contDiv++;
			}
		}
		
		System.out.println("Quantidade de números divisíveis por 5 e 7: " + contDiv);
		
		teclado.close();
	}
}