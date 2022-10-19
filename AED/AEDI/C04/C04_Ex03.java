import java.text.DecimalFormat;
import java.util.Scanner;

public class C04_Ex03 
{
	public static void main(String[] args) 
	{
		int minPol, maxPol;
		double multa1, multa2, multa3;
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("Informe o mínimo de poluentes: ");
		minPol = teclado.nextInt();
		
		System.out.print("Informe o máximo de poluentes: ");
		maxPol = teclado.nextInt();
		
		System.out.println("Qual o valor da multa até " + minPol + " poluentes emitidos?");
		multa1 = teclado.nextDouble();
		
		System.out.println("Qual o valor da multa entre " + minPol + " e " + maxPol + " poluentes emitidos?");
		multa2 = teclado.nextDouble();
		
		System.out.println("Qual o valor da multa a partir de " + maxPol + " poluentes emitidos(multa multiplicado por poluente emitido)");
		multa3 = teclado.nextDouble();
		
		String multa1Format = new DecimalFormat("#,##0.00").format(multa1);
		String multa2Format = new DecimalFormat("#,##0.00").format(multa2);
		String multa3Format = new DecimalFormat("#,##0.00").format(multa3);
		
		System.out.println("_______________________________________________________________");
		System.out.println("       Quantidade de Poluente Emitido x Valor da Multa");
		System.out.println("_______________________________________________________________");
		System.out.println("Até " + minPol + " multa de R$" + multa1Format);
		System.out.println("_______________________________________________________________");
		System.out.println("Acima de " + minPol + " até " + maxPol + " multa de R$" + multa2Format);
		System.out.println("_______________________________________________________________");
		System.out.println("Acima de " + maxPol +  " multa de R$" + multa3Format + " por poluente emitido");
		System.out.println("_______________________________________________________________");
		
		teclado.close();
	}
}