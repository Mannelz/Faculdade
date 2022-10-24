import java.util.Scanner;

public class C10_Ex01
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		double multa = 0, media = 0;
		
		do
		{
			System.out.print("Informe o valor: ");
			multa = teclado.nextDouble();
			
			if(multa != -1)
			{
				multa = multa * 10 / 100;
				System.out.println("Multa: R$" + multa);
				
				media += multa;
				cont ++;
			}
		}
		while(multa != -1);
		
		media /= cont;
		
		System.out.printf("A média dos valores da nulta é: R$%1.2f", media);
		
		teclado.close();
	}
}