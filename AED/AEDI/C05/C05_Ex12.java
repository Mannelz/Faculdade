import javax.swing.JOptionPane;

public class C05_Ex12 {
	public static void main(String[] args) 
	{
		String duracaoStr;
		int duracao;
		
		duracaoStr = JOptionPane.showInputDialog(null, "Informe a duração do eveneto (em segundos): ", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		duracao = Integer.valueOf(duracaoStr).intValue();
		
		int horas = (duracao / 60) / 60; //Poderia dividir por 3600 direto, pois, 60 * 60 = 3600;
		int segundos = duracao % 3600;
		int minutos = segundos / 60;
		segundos %= 60;
		
		JOptionPane.showMessageDialog(null, "Segundos Informados: " + duracao + "\n\nHor: " + horas + " Min: " + minutos + " Seg: " + segundos + 
				"\n(" + horas + ":" + minutos + ":" + segundos + ")", "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}