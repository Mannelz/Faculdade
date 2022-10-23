import java.util.Scanner;

public class C09_Ex09
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
			num = Math.pow(3, i + 1);
			den = (9 + i) * Math.sqrt(Math.pow(i, 4));
			
			serie += num / den;
		}
		
		serie = 100 - Math.pow(serie, 3);
		
		System.out.println("Valor da série: " + serie);
		
		teclado.close();
	}
}