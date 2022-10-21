import javax.swing.JOptionPane;

public class C06_Ex13 
{
	public static void main(String[] args) 
	{
		String horaInicialStr, horaFinalStr, minInicialStr, minFinalStr;
		int horaInicial, horaFinal, minInicial, minFinal;
		
		horaInicialStr = JOptionPane.showInputDialog(null, "Informe a hora do inicio do jogo:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		horaInicial = Integer.valueOf(horaInicialStr).intValue();
		
		minInicialStr = JOptionPane.showInputDialog(null, "Informe o minuto do inicio do jogo:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		minInicial = Integer.valueOf(minInicialStr).intValue();
		
		horaFinalStr = JOptionPane.showInputDialog(null, "Informe a hora do fim do jogo:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		horaFinal = Integer.valueOf(horaFinalStr).intValue();
		
		minFinalStr = JOptionPane.showInputDialog(null, "Informe o minuto do fim do jogo:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		minFinal = Integer.valueOf(minFinalStr).intValue();
		
		int horaResultado, minResultado;
		
		horaResultado = horaFinal - horaInicial;
		minResultado = minFinal - minInicial;
		
		if(minResultado > 60)
		{
			horaResultado++;
			minResultado -= 60;
		}
		else if(minResultado < 0)
		{
			horaResultado--;
			minResultado += 60;
		}
		
		JOptionPane.showMessageDialog(null, "O jogo durou " + horaResultado + " horas e " + minResultado + " minutos", "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}