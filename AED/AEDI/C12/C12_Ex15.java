import java.util.Scanner;

public class C12_Ex15
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int [10];
		int contPar = 0;
		double media = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe um número inteiro: ");
			num[i] = teclado.nextInt();
		}
		
		System.out.print("Números pares: ");
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 2 == 0)
			{
				System.out.print(num[i] + " ");
				
				media += num[i];
				contPar++;
			}
			System.out.println();
		}
		
		media /= contPar;
		
		System.out.println("Média dos pares: " + media);
		
		teclado.close();
	}
}