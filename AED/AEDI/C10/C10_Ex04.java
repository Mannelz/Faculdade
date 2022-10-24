import java.util.Scanner;

public class C10_Ex04
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nome = null;
		int qntProduto;
		double BDI, precoUnit, custoFinal, custoParcial, custoTotal = 0; 
		
		System.out.print("Informe a taxa do BDI: ");
		BDI = teclado.nextDouble();
		
		teclado.nextLine();
		
		BDI /= 100; 
		
		do
		{
			System.out.println("Informe o nome do produto: ");
			nome = teclado.nextLine();
			
			if(!nome.equalsIgnoreCase("FIM"))
			{
				System.out.println("Informe a quantidade: ");
				qntProduto = teclado.nextInt();
				
				System.out.println("Informe o preço unitário: ");
				precoUnit = teclado.nextDouble();
				
				teclado.nextLine();
				
				custoParcial = precoUnit * qntProduto;
				
				System.out.println(nome + " - R$" + custoParcial);
				
				custoTotal += custoParcial;
			}
		}
		while(!nome.equalsIgnoreCase("FIM"));
		
		BDI *= custoTotal;
		custoFinal = custoTotal + BDI;
		
		System.out.printf("Preço final: R$%1.2f", custoFinal);
		
		teclado.close();
	}
}