import java.util.Scanner;

public class C10_Ex03
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		double angulo, setor, raio, pi = 3.1416;
		
		System.out.print("Informe o valor do ângulo: ");
		angulo = teclado.nextDouble();
		
		do
		{
			System.out.print("Informe o valor do raio: ");
			raio = teclado.nextDouble();
			
			if(raio != -1)
			{
				setor = (angulo * pi * Math.pow(raio, 2)) / 360;
				
				System.out.println("Área do setor circular: " + setor);
			}
		}
		while(raio != -1);
		
		teclado.close();
	}
}