import javax.swing.JOptionPane;

public class C08_Ex08
{
	public static void main(String[] args)
	{
		String notaStr, faltaStr, resultado;
		double nota, notaAprovado = 0, media;
		int falta, faltaMaior16 = 0, aprovado = 0;
		
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
				resultado = "Aluno Aprovado";
				
				aprovado++;
				notaAprovado += nota;
			}
			else
			{
				resultado = "Aluno Reprovado";
			}
			
			if(falta > 16)
			{
				faltaMaior16++;
			}
			
			JOptionPane.showMessageDialog(null, resultado, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
		}
		
		media = notaAprovado / aprovado;
		
		JOptionPane.showMessageDialog(null, "Média das notas dos aprovados: " + media + 
				"\nAlunos com mais de 16 faltas: " + faltaMaior16, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}