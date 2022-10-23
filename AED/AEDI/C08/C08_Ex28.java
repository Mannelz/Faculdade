public class C08_Ex28
{
	public static void main(String[] args)
	{
		int triangular, soma = 0, cont = 0;
		double media;
		
		for(int i = 1; i * (i+1) * (i+2) <= 1000; i++)
		{
			triangular = i * (i+1) * (i+2);
			soma += triangular;
			cont++;
			
			System.out.print(triangular + " ");
		}
		
		media = soma / cont;
		
		System.out.println();
		System.out.print("Média: " + media);
	}
}