import javax.swing.JOptionPane;

public class C06_Ex11 
{
	public static void main(String[] args) 
	{
		String equipe1, equipe2, setEquipe1Str, setEquipe2Str;
		int setEquipe1, setEquipe2, pontoEquipe1 = 0, pontoEquipe2 = 0;
		
		equipe1 = JOptionPane.showInputDialog(null, "Qual o nome da equipe 1?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		setEquipe1Str = JOptionPane.showInputDialog(null, "Quantos sets a equipe 1 fez?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		setEquipe1 = Integer.valueOf(setEquipe1Str).intValue();
		
		equipe2 = JOptionPane.showInputDialog(null, "Qual o nome da equipe 2?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		setEquipe2Str = JOptionPane.showInputDialog(null, "Quantos sets a equipe 2 fez?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		setEquipe2 = Integer.valueOf(setEquipe2Str).intValue();
		
		// Equipe 1 
		if(setEquipe2 <= 1)
		{
			pontoEquipe1 = 3;
			pontoEquipe2 = 0;
		}
		else if(setEquipe2 == 2)
		{
			pontoEquipe1 = 2;
			pontoEquipe2 = 1;
		}
		// Equipe 2
		else if(setEquipe1 <= 1)
		{
			pontoEquipe1 = 0;
			pontoEquipe2 = 3;
		}
		else if(setEquipe1 == 2)
		{
			pontoEquipe1 = 1;
			pontoEquipe2 = 2;
		}
		
		JOptionPane.showMessageDialog(null, "RESULTADO:" + "\n\n" + equipe1 + " " + pontoEquipe1 + 
				" X " + pontoEquipe2 + " " + equipe2, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}