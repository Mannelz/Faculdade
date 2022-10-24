import java.util.Scanner;

public class C12_Ex08
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int[20];
	
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe um número inteiro: ");
			num[i] = teclado.nextInt();
		}
		
		System.out.print("Soma: ");
		
		for(int i = 0; i < num.length/2; i++)
		{
			System.out.print((num[i] + num[i + 10])+ " ");
		}
		
		teclado.close();
	}
}