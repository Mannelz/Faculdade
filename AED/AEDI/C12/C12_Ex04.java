import java.util.Scanner;

public class C12_Ex04
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
		
		System.out.print("Valores ao quadrado: ");
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print((int)Math.pow(num[i], 2) + " ");
		}
		
		teclado.close();
	}
}