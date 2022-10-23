public class C08_Ex17
{
	public static void main(String[] args)
	{
		double aux;
		
		for(int x = 3; x <= 12; x++)
		{
			aux = Math.sqrt(Math.pow(x, 2) - 3);
			
			System.out.println("x = " + x + " f(x) = " + aux);
		}
	}
}