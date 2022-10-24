import java.util.Scanner;

public class C12_Ex22
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int placa[] = new int[100];
		String nome[] = new String[placa.length];
		int placaDesejada;
		
		for(int i = 0; i < placa.length; i++)
		{
			System.out.print("Informe a placa do carro: ");
			placa[i] = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Informe o nome do dono: ");
			nome[i] = teclado.nextLine();
		}
		
		System.out.println("Informe a placa do carro do morador que deseja procurar: ");
		placaDesejada = teclado.nextInt();
		
		for(int i = 0; i < placa.length; i++)
		{
			if(placaDesejada == placa[i])
			{
				System.out.print("O morador se encontra na vaga: " + (i + 1));
				break;
			}
		}
		
		teclado.close();
	}
}