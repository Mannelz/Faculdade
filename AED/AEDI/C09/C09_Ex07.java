public class C09_Ex07
{
	public static void main(String[] args)
	{
		double num, den, serie = 0;
		
		for(int i = 1; i <= 6; i++)
		{
			num = (2 * i - 2) + (3 * i);
			den = 6 * i + 1;
			
			serie += num / den;
		}
		
		System.out.println("O valor da série é: " + serie);
	}
}