import java.util.Scanner;

public class C08_Ex10
{
	public static void main(String[] args) 
	{
		String nome, maisCaro = "";
		int qntConsumo, numInsumo;
		double preco, custoParcial = 0, custoTotal = 0, media, precoMaior = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de insumos: ");
		numInsumo = teclado.nextInt();
		System.out.println();
		teclado.nextLine();
		
		for(int i = 1; i <= numInsumo; i++)
		{
			System.out.print("Informe o nome do insumo: ");
			nome = teclado.nextLine();
			System.out.print("Informe o preço unitário do(a) " + nome + ": ");
			preco = teclado.nextDouble();
			System.out.print("Informe a quantidade consumida: ");
			qntConsumo = teclado.nextInt();
			System.out.println();
			teclado.nextLine();
			
			if(i == 1 || precoMaior < preco)
			{
				precoMaior = preco;
				maisCaro = nome;
			}
			
			custoParcial = qntConsumo * preco;
			custoTotal += custoParcial;
		}
	
		media = custoTotal / numInsumo;
		
		System.out.println("Custo total: R$" + custoTotal);
		System.out.println("Média dos custos parciais: R$" + media);
		System.out.println("Nome do insumo mais caro: " + maisCaro);
		
		teclado.close();
	}
}