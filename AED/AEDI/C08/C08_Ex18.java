import java.util.Scanner;

public class C08_Ex18 
{
	public static void main(String[] args) 
	{
		int num, multi;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro de 1 a 9");
		num = teclado.nextInt();
		
		for(int i = 1; i <= 9; i++)
		{
			multi = num * i;
			
			System.out.println(num + " x " + i + " = " + multi);
		}
		
		teclado.close();
	}
}