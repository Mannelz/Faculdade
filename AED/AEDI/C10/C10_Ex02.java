import java.util.Scanner;

public class C10_Ex02
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int contMedia = 0, contMaior = 0;
		double valor = 0, media, valorTot = 0;
		
		do
		{
			System.out.print("Informe o valor do serviço: ");
			valor = teclado.nextDouble();
			
			if(valor != 0)
			{
				contMedia++;
				
				valorTot += valor;
				
				if(valor > 1000)
				{
					contMaior++;
				}
			}
		}
		while(valor != 0);
		
		media = valorTot / contMedia;
		
		System.out.printf("Valor total recebido: R$%1.2f\n", valorTot);
		System.out.printf("A média dos valores: R$%1.2f\n", media);
		System.out.println("Quantidade de valores maior que R$1.000,00: " + contMaior);
		
		teclado.close();
	}
}