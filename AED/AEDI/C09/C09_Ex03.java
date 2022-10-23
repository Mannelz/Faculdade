import java.util.Scanner;

public class C09_Ex03
{
	public static void main(String[] args)
	{
		int termos;
		double num, den, serie = 0;	
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de termos: ");
		termos = teclado.nextInt();
		
		for(int i = 1; i <= termos; i++)
		{
			num = 1 + (Math.sqrt(i * 4));
			den = i * 3;
			
			serie += num / den;
		}
		
		System.out.println(serie);
		
		teclado.close();
	}
}