import javax.swing.JOptionPane;

public class C08_Ex07
{
	public static void main(String[] args)
	{
		String nome, idadeStr;
		int idade, menor12 = 0, maior30 = 0, soma = 0;
		double media;
		
		for(int i = 1; i <= 50; i++)
		{
			nome = JOptionPane.showInputDialog(null, "Qual seu nome?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			idadeStr = JOptionPane.showInputDialog(null, nome + ", informe sua idade", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			idade = Integer.valueOf(idadeStr).intValue();
			
			if(idade <= 12)
			{
				menor12++;
			}
			else if(idade > 30)
			{
				maior30++;
			}
			
			soma += idade;
		}
		
		media = soma / 50f;
		
		JOptionPane.showMessageDialog(null, "Alunos com até 12 anos: " + menor12 + 
				"\nAlunos acima de 30 anos: " + maior30 + 
				"\nMédia das idades: " + media, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}