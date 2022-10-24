import java.util.Scanner;

public class C12_Ex24
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nomes[] = new String[20];
		int pontuacoes[] = new int[nomes.length];
		
		//String nomes[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};
		//int pontuacoes[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		String tempNome, nomeDesejado;
		int tempPontuacao, pos = -1;
		
		for(int i = 0; i < nomes.length; i++)
		{
			System.out.print("Informe o nome da equipe: ");
			nomes[i] = teclado.nextLine();
			
			System.out.print("Informe a pontuação da equipe: ");
			pontuacoes[i] = teclado.nextInt();
			
			teclado.nextLine();
		}
		
		for(int i = 0; i < nomes.length - 1; i++)
		{
			for(int j = 0; j < nomes.length - 1; j++)
			{
				if(pontuacoes[j] < pontuacoes[j + 1])
				{
					tempPontuacao = pontuacoes[j];
					pontuacoes[j] = pontuacoes[j + 1];
					pontuacoes[j + 1] = tempPontuacao;
					
					tempNome = nomes[j];
					nomes[j] = nomes[j + 1];
					nomes[j + 1] = tempNome;
				}
			}
		}
		
		System.out.print("Informe o nome da equipe que deseja procurar: ");
		nomeDesejado = teclado.nextLine();
		
		for(int i = 0; i < nomes.length; i++)
		{
			if(nomes[i].compareToIgnoreCase(nomeDesejado) == 0)
			{
				pos = i + 1;
			}
		}
		
		if(pos != -1)
		{
			if(pos >= 1 && pos <= 4)
			{
				System.out.println("A equipe se encontra na posição: " + pos + " - Copa Libertadores");
			}
			else if(pos <= 12)
			{
				System.out.println("A equipe se encontra na posição: " + pos + " - Copa Sul-americana");
			}
			else if(pos >= 17 && pos <= 20)
			{
				System.out.println("A equipe se encontra na posição: " + pos + " - Rebaixada");
			}
			else
			{
				System.out.println("A equipe se encontra na posição: " + pos);
			}
		}
		else
		{
			System.out.println("Equipe não encontrada!");
		}
		
		teclado.close();
	}
}