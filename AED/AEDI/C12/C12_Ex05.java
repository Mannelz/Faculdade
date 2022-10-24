import java.util.Scanner;

public class C12_Ex05
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int[10];
		int maior = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe um número inteiro: ");
			num[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < num.length; i++)
		{
			if(i == 0 || maior < num[i])
			{
				maior = num[i];
			}
		}
		
		System.out.println("Maior valor: " + maior);
		
		teclado.close();
	}
}