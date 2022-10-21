import javax.swing.JOptionPane;

public class C06_Ex08 
{
	public static void main(String[] args) 
	{
		String nome, alturaStr;
		double altura, pesoMin, pesoMax;
		
		nome = JOptionPane.showInputDialog(null, "Qual seu nome?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		alturaStr = JOptionPane.showInputDialog(null, "Olá " + nome + ", qual a sua altura(em metros)?", JOptionPane.QUESTION_MESSAGE);
		altura = Double.valueOf(alturaStr).doubleValue();
		
		pesoMin = 20 * Math.pow(altura, 2);
		pesoMax = 25 * Math.pow(altura, 2);
		
		JOptionPane.showMessageDialog(null, "Para estar no peso ideal, "
				+ "o peso mínimo é " + pesoMin + " e o máximo " + pesoMax, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}