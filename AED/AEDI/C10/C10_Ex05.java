import java.util.Scanner;

public class C10_Ex05
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String sexo = null;
		int cont = 0, contF = 0, contFMenor = 0, contM = 0;
		double altura, peso, media = 0;
		
		do
		{
			System.out.print("Informe o sexo (M/F): ");
			sexo = teclado.nextLine();
			
			if(!sexo.equalsIgnoreCase("FIM"))
			{
				System.out.print("Informe a altura: ");
				altura = teclado.nextDouble();
				
				System.out.print("Informe o peso: ");
				peso = teclado.nextDouble();
				
				teclado.nextLine();
				
				cont++;
				
				if(sexo.equalsIgnoreCase("M"))
				{
					contM++;
					media += altura;
				}
				else
				{
					contF++;
					
					if(peso < 60)
					{
						contFMenor++;
					}
				}
			}
		}
		while(!sexo.equalsIgnoreCase("FIM"));
		
		media /= contM; 
		
		System.out.println("Quantidade de pessoas pesquisadas: " + cont);
		System.out.println("Qauntidade de mulheres: " + contF);
		System.out.println("Média das alturas dos homens: " + media);
		System.out.println("Quantidade de mulheres que pesam menos de 60Kg: " + contFMenor);
		
		teclado.close();
	}
}