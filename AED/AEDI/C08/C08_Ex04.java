import javax.swing.JOptionPane;

public class C08_Ex04
{
	public static void main(String[] args)
	{
		String nome, idadeStr;
		int idade, contMaior = 0;
		
		for(int i = 1; i <= 50; i++)
		{
			nome = JOptionPane.showInputDialog(null, "Qual o seu nome?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			
			idadeStr = JOptionPane.showInputDialog(null, nome + ", qual a sua idade?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			idade = Integer.valueOf(idadeStr).intValue();
			
			if(idade > 18)
			{
				contMaior++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Alunos com até 18 anos: " + (50 - contMaior) + 
				"\nAlunos maiores de 18 anos: " + contMaior, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}