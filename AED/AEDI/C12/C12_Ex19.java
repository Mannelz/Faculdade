import java.util.Scanner;

public class C12_Ex19
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num[] = new int [5];
		int sorteado, pos = -1;
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("Informe o n�mero do bilhete: ");
			num[i] = teclado.nextInt();
		}
		
		System.out.print("Informe o n�mero sorteado: ");
		sorteado = teclado.nextInt();
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] == sorteado)
			{
				pos = i;
			}
		}
		
		if(pos != -1)
		{
			System.out.println("O bilhete sorteado � o " + num[pos]);
		}
		else
		{
			System.out.println("Voc� n�o foi sorteado.");
		}
		
		teclado.close();
	}
}