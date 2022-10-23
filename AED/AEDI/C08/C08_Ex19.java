public class C08_Ex19
{
	public static void main(String[] args)
	{
		int soma = 0, aux;
		
		for(int i = 1; i <= 100; i++)
		{
			aux = i * i;
			
			System.out.println(aux);
			
			soma += aux;
		}
		
		System.out.print("A soma dos 100 primeiros termos é: " + soma);
	}
}