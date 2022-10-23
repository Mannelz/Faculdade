import java.util.Scanner;

import javax.swing.JOptionPane;

public class C08_Ex31
{
	public static void main(String[] args)
	{
		String nome, cargo, nomeMaisPobre, cargoMaisPobre, qntEngeStr;
		int qntEnge = 0, cont = 0, contAdm = 0, contOutro = 0;
		double salario, salarioAdm = 0, media, salarioMaisPobre = 0;
		Scanner arquivo = new Scanner(C08_Ex31.class.getResourceAsStream("engenheiros.txt"));
		
		qntEngeStr = JOptionPane.showInputDialog(null, "Informe a quantidade de engenheiros", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		qntEnge = Integer.valueOf(qntEngeStr).intValue();
		
		for(int i = 1; i <= qntEnge; i++)
		{
			nome = arquivo.nextLine();
			cargo = arquivo.nextLine();
			salario = arquivo.nextDouble();
			arquivo.nextLine();
			
			if(cargo == "C" && salario < 2500 || cargo == "P" && salario < 4650 || cargo == "A" && salario < 3200 || cargo == "A" && salario < 5100)
			{
				JOptionPane.showMessageDialog(null, "Abaixo do salário mínimo", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			}
			
			if(cargo == "C" && salario == 2500 || cargo == "P" && salario == 4650 || cargo == "A" && salario == 3200 || cargo == "A" && salario == 5100)
			{
				cont++;
			}
			
			if(cargo == "A")
			{
				salarioAdm += salario;
				contAdm++;
			}
			else if(cargo == "X" && salario > 5000)
			{
				contOutro++;
			}
			
			if(i == 0 || salarioMaisPobre > salario)
			{
				salarioMaisPobre = salario;
				
				nomeMaisPobre = nome;
				cargoMaisPobre = cargo;
			}
		}
		
		arquivo.close();
	}
}