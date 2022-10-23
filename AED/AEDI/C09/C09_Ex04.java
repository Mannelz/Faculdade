import java.util.Scanner;

public class C09_Ex04 
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
			num =
			den = (i * 4 - 1) * (i * 4);
			
		}
		
		System.out.println(serie);
		
		teclado.close();
	}
}