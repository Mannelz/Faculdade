import java.util.Scanner;

public class C12_Ex13
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String mes[] = new String[12];
		String tempMes;
		
		for(int i = 0; i < mes.length; i++)
		{
			System.out.print("Informe o nome do mês " + (i + 1) + ": ");
			mes[i] = teclado.nextLine();
		}
		
		for(int i = 0; i < mes.length - 1; i++)
		{
			for(int j = 0; j < mes.length - 1; j++)
			{
				if(mes[j].compareToIgnoreCase(mes[j + 1]) > 0)
				{
					tempMes = mes[j];
					mes[j] = mes[j + 1];
					mes[j + 1] = tempMes;
				}
			}
		}
		
		System.out.print("Ordem alfabética: ");
		
		for(int i = 0; i < mes.length; i++)
		{
			System.out.print(mes[i] + " ");	
		}
		
		teclado.close();
	}
}