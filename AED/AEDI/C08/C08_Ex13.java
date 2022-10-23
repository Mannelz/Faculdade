import java.util.Scanner;

import javax.swing.JOptionPane;

public class C08_Ex13 
{
	public static void main(String[] args)
	{
		String cidade, cidadeMenor = "";
		int populacao, eleitores, qntMulher, qntHomem, milhonarios = 0, maisMulher = 0, menorPopulacao = 0;
		double percent;
		Scanner arquivo = new Scanner(System.class.getResourceAsStream("cidades.txt"));
		
		for(int i = 1; i <= 5; i++)
		{
			cidade = arquivo.nextLine();
			populacao = arquivo.nextInt();
			eleitores = arquivo.nextInt();
			qntHomem = arquivo.nextInt();
			qntMulher = arquivo.nextInt();
			
			if(populacao != (qntMulher + qntHomem))
			{
				JOptionPane.showMessageDialog(null, "ERROR: A população da cidade " + cidade + " está diferente da quantidade de homens e mulheres informados", "Aula Java", JOptionPane.ERROR_MESSAGE);
			}
			
			percent = (eleitores * 100) / populacao;
			
			JOptionPane.showMessageDialog(null, "O percentual de eleitores da cidade " + cidade + " é de " + percent + "%", "Aula Java", JOptionPane.INFORMATION_MESSAGE);
			
			if(populacao > 1000000)
			{
				milhonarios++;
			}
			
			if(qntMulher > qntHomem)
			{
				maisMulher++;
			}
			
			if(i == 1 || menorPopulacao > populacao)
			{
				menorPopulacao = populacao;
				cidadeMenor = cidade;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Cidades com mais de 1 milhâo de habitantes: " + milhonarios + 
				"\nCidades com mais mulheres: " + maisMulher + 
				"\nNome da cidade com menor população: " + cidadeMenor, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
		
		arquivo.close();
	}
}