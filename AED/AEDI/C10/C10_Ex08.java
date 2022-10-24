import java.util.Scanner;

public class C10_Ex08
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cidade, cidadeMenor = null;
		int populacao, eleitores, homens, mulheres, contCidades = 0, populacaoTotal = 0, eleitoresTotal = 0, contM = 0, populacaoMenor = 0, 
				homensTotal = 0;
		double mediaH, percEleitor;
		
		do
		{
			System.out.println("Informe o nome da cidade: ");
			cidade = teclado.nextLine();
			System.out.println("Informe a população: ");
			populacao = teclado.nextInt();
			System.out.println("Informe a quantidade de eleitores: ");
			eleitores = teclado.nextInt();
			System.out.println("Informe a quantidade de homens: ");
			homens = teclado.nextInt();
			System.out.println("Informe a quantidade de mulheres: ");
			mulheres = teclado.nextInt();
			
			teclado.nextLine();
			
			contCidades++;
			populacaoTotal += populacao;
			eleitoresTotal += eleitores;
			homensTotal += homens;
			
			if(homens + mulheres != populacao)
			{
				System.out.println("ERROR: A quantidade de homens e mulheres difere da população.");
			}
			
			if(mulheres > homens)
			{
				contM++;
			}
			
			if(populacaoMenor > populacao)
			{
				populacaoMenor = populacao;
				cidadeMenor = cidade;
			}
		}
		while(!cidade.equalsIgnoreCase("Zimbabue de Minas"));
		
		mediaH = homensTotal / contCidades; 
		percEleitor = (eleitoresTotal * 100) / populacaoTotal;
		
		System.out.println("Total de cidades: " + contCidades);
		System.out.println("População total: " + populacaoTotal);
		System.out.println("Percentual de eleitores: " + percEleitor);
		System.out.println("Cidades com mais mulheres: " + contM);
		System.out.println("Média de homens: " + mediaH);
		System.out.println("Cidade com menor população: " + cidadeMenor);
		
		teclado.close();
	}
}