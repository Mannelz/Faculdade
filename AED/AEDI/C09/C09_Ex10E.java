public class C09_Ex10E 
{
	public static void main(String[] args) 
	{
		double num, den , serie = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			num = i;
			den = 3 * (2 * i);
			
			serie += num / den;
		}
		
		System.out.println("Valor da série: " + serie);		
	}
}