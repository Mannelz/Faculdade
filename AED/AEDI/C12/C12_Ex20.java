import java.util.Scanner;

public class C12_Ex20
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int [10];
		int cont = 0;
		double media = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe um número inteiro: ");
			num[i] = teclado.nextInt();
			
			
		}
		
		System.out.print("Números maiores que " + num[num.length - 1] + ": ");
		
		for(int i = 0; i < num.length - 1; i++)
		{
			if(num[i] > num[num.length - 1])
			{
				System.out.print(num[i] + " ");
				
				media += num[i];
				cont++;
			}	
		}
		
		System.out.println();
		
		media /= cont;
		
		System.out.println("Média dos números: " + media);
		
		teclado.close();
	}
}