import java.util.Scanner;

import javax.swing.JOptionPane;

public class C08_Ex15
{
	public static void main(String[] args)
	{
		String nome = "", cargo = "", nomeMaisRico = "", cargoMaisRico = "";
		int idade = 0, cont18 = 0;
		double salario = 0, media18 = 0, maiorSalario = 0;
		Scanner arquivo = new Scanner(C08_Ex15.class.getResourceAsStream("funcionarios.txt"));
		
		for(int i = 1; i <= 10; i++)
		{
			nome = arquivo.nextLine();
			cargo = arquivo.nextLine();
			salario = arquivo.nextDouble();
			idade = arquivo.nextInt();
			arquivo.nextLine();
			
			if(salario > 10000 && idade > 50)
			{
				JOptionPane.showMessageDialog(null, "O funcionário " + nome + " é sênior", "Aula Java", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(idade <= 18)
			{
				media18 += salario;
				cont18++;
			}
			
			if(i == 0 || maiorSalario < salario)
			{
				maiorSalario = salario;
				
				nomeMaisRico = nome;
				cargoMaisRico = cargo;
			}
		}
		
		media18 /= cont18;
		
		JOptionPane.showMessageDialog(null, "Média dos salários dos jovens até 18 anos: R$" + media18 + 
				"\nO nome e cargo do funcionário com maior salário: " + nomeMaisRico + "/" + cargoMaisRico, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}