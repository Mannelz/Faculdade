import javax.swing.JOptionPane;

public class C08_Ex09 
{
	public static void main(String[] args) 
	{
		String nome, sexo, idadeStr, qntPessoasStr;
		int idade, qntPessoas, contM = 0, contF = 0;
		double mediaM, mediaF, somaM = 0, somaF = 0;
		
		qntPessoasStr = JOptionPane.showInputDialog(null, "Informe a quantidade de pessoas", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		qntPessoas = Integer.valueOf(qntPessoasStr).intValue();
		
		for(int i = 1; i <= qntPessoas; i++)
		{
			nome = JOptionPane.showInputDialog(null, "Informe o nome", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			
			idadeStr = JOptionPane.showInputDialog(null, "Informe a idade de " + nome, "Aula Java", JOptionPane.QUESTION_MESSAGE);
			idade = Integer.valueOf(idadeStr).intValue();
			
			sexo = JOptionPane.showInputDialog(null, "Informe o sexo (M / F) de " + nome, "Aula Java", JOptionPane.QUESTION_MESSAGE);
			
			if(sexo.equalsIgnoreCase("M"))
			{
				somaM += idade;
				contM ++;
			}
			else
			{
				somaF += idade;
				contF++;
			}
		}
		
		mediaM = somaM / contM;
		mediaF = somaF / contF;
		
		JOptionPane.showMessageDialog(null, "Média das idades dos homens: " + mediaM + 
				"\nMédia das idades das mulheres: " + mediaF, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}