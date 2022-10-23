import javax.swing.JOptionPane;

public class C08_Ex11
{
	public static void main(String[] args)
	{
		String[] opSexo = {"M", "F"};
		String[] opEstadoCivil = {"S", "C", "O"};
		String[] opCorOlho = {"A", "C", "P", "O"}; 
		String[] opCorCabelo = {"L", "P", "C", "R"};
		String[] opEscolaridade = {"1", "2", "3", "4"};
		String nome, maisRico = "", idadeStr, salarioStr; 
		int idade, sexo, estadoCivil, corOlho, corCabelo, escolaridade, perfectWoman = 0;
		double salario, maiorSalario = 0, menorSalarioHomem = 0, maiorSalarioHomem = 0, diferencaSalario = 0;
		
		for(int i = 1; i <= 50; i++)
		{
			nome = JOptionPane.showInputDialog(null, "Informe o nome", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			
			idadeStr = JOptionPane.showInputDialog(null, "Informe a idade de " + nome, "Aula Java", JOptionPane.QUESTION_MESSAGE);
			idade = Integer.valueOf(idadeStr).intValue();
			
			sexo = JOptionPane.showOptionDialog(null, "Informe o sexo (M - Masculino, F - Feminino)", "Aula Java", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opSexo, "M");
			
			estadoCivil = JOptionPane.showOptionDialog(null, "Informe o estado civil (S - Solteiro(a), C - Casado(a), O - Outro)", "Aula Java", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opEstadoCivil, "S");
			
			corOlho = JOptionPane.showOptionDialog(null, "Informe a cor dos olhos (A - Azul, C - Castanho, P - Preto, O - Outro)", "Aula Java", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opCorOlho, "A");
			
			corCabelo = JOptionPane.showOptionDialog(null, "Informe a cor dos cabelos (L - Loiro, P - Preto, C - Castanho, R - Ruivo)", "Aula Java", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opCorCabelo, "L");
			
			salarioStr = JOptionPane.showInputDialog(null, "Informe o salário (R$)", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			salario = Double.valueOf(salarioStr).doubleValue();

			escolaridade = JOptionPane.showOptionDialog(null, "Informe o nível de escolaridade (1 - Analfabeto, 2 - Ensino Fundamental, 3 - Ensino Médio, 4 - Superior)", "Aula Java", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opEscolaridade, "1");
		
			if(i == 0 || maiorSalario < salario)
			{
				maiorSalario = salario;
				maisRico = nome;
			}
			
			if(sexo == 1 && corCabelo == 0 && corOlho == 0 && estadoCivil == 0 && escolaridade == 3 && idade >= 18 && idade <= 25 && salario > 10000)
			{
				perfectWoman++;
			}
			
			if(sexo == 0)
			{
				if(menorSalarioHomem == 0 || menorSalarioHomem > salario)
				{
					menorSalarioHomem = salario;
				}
				else if(maiorSalarioHomem < salario)
				{
					maiorSalarioHomem = salario;
				}
			}
		}
		
		diferencaSalario = maiorSalarioHomem - menorSalarioHomem;
		
		JOptionPane.showMessageDialog(null, "Quantidade de 'Perfect Woman': " + perfectWoman, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Nome da pessoa com maior salário: " + maisRico, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Diferença entre o maior e o menor salário: " + diferencaSalario, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}