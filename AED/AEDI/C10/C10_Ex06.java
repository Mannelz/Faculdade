import java.util.Scanner;

public class C10_Ex06
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		double a, b, c, x, y, distancia, reta;
		
		System.out.print("Informe o valor de A: ");
		a = teclado.nextDouble();
		System.out.print("Informe o valor de B: ");
		b = teclado.nextDouble();
		System.out.print("Informe o valor de C: ");
		c = teclado.nextDouble();
	
		do
		{
			System.out.print("Informe a coordenada X: ");
			x = teclado.nextDouble();
			System.out.print("Informe o valor de Y: ");
			y = teclado.nextDouble();
			
			reta = a * x + b * y + c;
			distancia = reta / Math.sqrt(a * a + b * b);
			
			System.out.println("Distância: " + distancia);
		}
		while(distancia != 0);
		
		System.out.println("Ponto de coincidência: P(" + x + ", " + y + ")");
		
		teclado.close();
	}
}