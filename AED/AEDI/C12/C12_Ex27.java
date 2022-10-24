import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_Ex27
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		List<Integer> ra = new ArrayList<>();
		List<String> nome = new ArrayList<>();
		String nomeDesejado, tempNome;
		int pos = -1, tempRA;
		
		for(int i = 0; i < 50; i++)
		{
			System.out.print("Informe o nome do aluno: ");
			nome.add(teclado.nextLine());
			
			System.out.print("Informe o registro acadêmico do aluno: ");
			ra.add(teclado.nextInt());
			
			teclado.nextLine();
		}
		
		for(int i = 0; i < nome.size() - 1; i++)
		{
			for(int j = 0; j < nome.size() - 1; j++)
			{
				if(nome.get(j).compareToIgnoreCase(nome.get(j + 1)) > 0)
				{
					tempNome = nome.get(j);
					nome.set(j, nome.get(j + 1));
					nome.set(j + 1, tempNome);
					
					tempRA = ra.get(j);
					ra.set(j, ra.get(j + 1));
					ra.set(j + 1, tempRA);
				}
			}
		}
		
		System.out.print("Informe o nome que deseja procurar: ");
		nomeDesejado = teclado.nextLine();
		
		for(int i = 0; i < nome.size(); i++)
		{
			if(nome.get(i).compareToIgnoreCase(nomeDesejado) == 0)
			{
				pos = i;
			}
		}
		
		if(pos != -1)
		{
			System.out.println("RA: " + ra.get(pos) + "\nPosição: " + (pos + 1));
		}
		else
		{
			System.out.println("Nome não encontrado!");
		}
		
		teclado.close();
	}
}