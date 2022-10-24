import java.util.Scanner;

public class C12_Ex06
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String mes[] = new String[12];
		
		for(int i = 0; i < mes.length; i++)
		{
			System.out.print("Informe o nome do mês " + (i + 1) + ": ");
			mes[i] = teclado.nextLine();
		}
		
		for(int i = mes.length - 1; i >= 0; i--)
		{
			System.out.print(mes[i] + " ");
		}
		
		teclado.close();
	}
}