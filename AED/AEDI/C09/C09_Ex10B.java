public class C09_Ex10B
{
	public static void main(String[] args)
	{
		double num, den , serie = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			num = 2 * i;
			den = 3 * i;
			
			serie += num / den;
		}
		
		serie = 1 + Math.sqrt(serie);
		
		System.out.println("Valor da série: " + serie);
	}
}