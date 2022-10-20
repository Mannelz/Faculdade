import javax.swing.JOptionPane;

public class C05_Ex09 
{
	public static void main(String[] args) 
	{
		String notaStr;
		double nota1, nota2, nota3;
		
		notaStr = JOptionPane.showInputDialog(null, "Informe o valor da nota 1:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		nota1 = Double.valueOf(notaStr).doubleValue();
		
		notaStr = JOptionPane.showInputDialog(null, "Informe o valor da nota 2:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		nota2 = Double.valueOf(notaStr).doubleValue();
		
		notaStr = JOptionPane.showInputDialog(null, "Informe o valor da nota 3:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		nota3 = Double.valueOf(notaStr).doubleValue();
	
		double aux = nota1 * 2 + nota2 * 3 + nota3 * 5;
		double media = aux / (2 + 3 + 5);
		
		JOptionPane.showMessageDialog(null, "Nota 1: " + nota1 + "\nNota 2: " + nota2
				+ "\nNota 3: " + nota3 + "\nMédia Ponderada: " + media, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}