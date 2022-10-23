import javax.swing.JOptionPane;

public class C08_Ex03
{
	public static void main(String[] args)
	{
		String notaStr, faltaStr;
		double nota;
		int falta, contAprovado = 0, contReprovado = 0;
		
		for(int i = 1; i <= 50; i++)
		{
			notaStr = JOptionPane.showInputDialog(null, "Informe a nota", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			nota = Double.valueOf(notaStr).doubleValue();
			
			if(nota == -1)
			{
				break;
			}
			
			faltaStr = JOptionPane.showInputDialog(null, "Informe a quantidade de faltas:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			falta = Integer.valueOf(faltaStr).intValue();
			
			if(nota >= 65 && falta <= 16)
			{
				contAprovado++;
			}
			else
			{
				contReprovado++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Alunos aprovados: " + contAprovado + 
				"\nAlunos reprovados: " + contReprovado, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}