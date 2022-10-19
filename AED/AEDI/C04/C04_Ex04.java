import javax.swing.JOptionPane;

public class C04_Ex04 
{
	public static void main(String[] args)
	{
		String nome, nomeComp, sobrenome, idadeStr;
		int idade;
		
		nome = JOptionPane.showInputDialog(null, "Informe seu nome:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		nomeComp = JOptionPane.showInputDialog(null, "Informe seu nome composto(se tiver):", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		sobrenome = JOptionPane.showInputDialog(null, "Informe seu sobrenome:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		idadeStr = JOptionPane.showInputDialog(null, "Informe sua idade", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		
		idade = Integer.valueOf(idadeStr).intValue();
		
		JOptionPane.showMessageDialog(null, sobrenome + ", " + nome + " " + nomeComp + "\nIdade: " + idade + " anos", "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}