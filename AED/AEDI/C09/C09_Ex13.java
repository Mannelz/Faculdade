public class C09_Ex13
{
	public static void main(String[] args)
	{
		double num, den = 0, serie = 0, fatorial = 1;
		
		for(int i = 1; i <= 10; i++)
		{
			num = i;
			fatorial *= num;
			
			if(i == 1)
			{
				den = 1;
			}
			else
			{
				den = Math.pow(2, i) - 1;
			}
			
			if(i % 2 == 0)
			{
				serie -= fatorial / den;
			}
			else
			{
				serie += fatorial / den;
			}
		}
		
		System.out.println("O valor da série é: " + serie);
	}
}