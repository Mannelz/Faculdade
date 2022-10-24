import java.util.Scanner;

public class C12_Ex16
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int [10];
		double multi;
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe um número inteiro: ");
			num[i] = teclado.nextInt();
		}
		
		System.out.print("Informe um número real: ");
		multi = teclado.nextDouble();
		
		System.out.print("Multiplicados pelo real: ");
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] * multi + " ");
		}
		
		teclado.close();
	}
}