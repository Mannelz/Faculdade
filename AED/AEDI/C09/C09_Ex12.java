public class C09_Ex12
{
	public static void main(String[] args)
	{
		double num, den = -1, serie = 0;
		
		for(int i = 1; i <= 10000; i++)
		{
			num = 1;
			den += 2;
			
			if(i % 2 == 0)
			{
				serie -= num / den;
			}
			else
			{
				serie += num / den;
			}
		}
		
		serie *= 4;
		
		System.out.println("O valor da série é: " + serie);
	}
}