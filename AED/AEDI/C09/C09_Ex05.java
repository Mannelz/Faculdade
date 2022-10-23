import java.util.Scanner;

public class C09_Ex05 
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int termos;
		double num, den, serie = 0;
		
		System.out.print("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
		
		for(int i = 1; i <= termos; i++)
		{
			num = (2 * (i - 1)) + (3 * i);
			den = (6 * i) + 1;
			
			serie += num / den;
		}
		
		serie *= 5;
		
		System.out.println("Valor da série: " + serie);
		
		teclado.close();
	}
}