import java.util.Scanner;

public class C08_Ex21
{
	public static void main(String[] args)
	{
		String situacaoCorporea;
		double altura, imc;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a altura:");
		altura = teclado.nextDouble();
		
		for(int peso = 60; peso <= 100; peso++)
		{
			imc = peso / Math.pow(altura, 2);
			
			if(imc < 20)
			{
				situacaoCorporea = "Abaixo do peso";
			}
			else if(imc <= 25)
			{
				situacaoCorporea = "Peso ideal";
			}
			else
			{
				situacaoCorporea = "Acima do peso";
			}
			
			if(peso == 60)
			{
				System.out.print("Peso | IMC | Situação Corporea");
				System.out.println();
			}
			
			System.out.print(peso + " " + imc + " " + situacaoCorporea);
			System.out.println();
		}
		
		teclado.close();
	}
}