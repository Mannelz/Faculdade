import javax.swing.JOptionPane;

public class C05_Ex04 
{
	public static void main(String[] args) 
	{
		String ponto1XStr, ponto1YStr;
		String ponto2XStr, ponto2YStr;
		
		double ponto1X, ponto1Y;
		double ponto2X, ponto2Y;
		
		ponto1XStr = JOptionPane.showInputDialog(null, "Informe o valor de X do ponto 1:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		ponto1X = Double.valueOf(ponto1XStr).doubleValue();
		
		ponto1YStr = JOptionPane.showInputDialog(null, "Informe o valor de Y do ponto 1:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		ponto1Y = Double.valueOf(ponto1YStr).doubleValue();
		
		ponto2XStr = JOptionPane.showInputDialog(null, "Informe o valor de X do ponto 2:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		ponto2X = Double.valueOf(ponto2XStr).doubleValue();
		
		ponto2YStr = JOptionPane.showInputDialog(null, "Informe o valor de Y do ponto 2:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		ponto2Y = Double.valueOf(ponto2YStr).doubleValue();
		
		double aux = (Math.pow(ponto1X - ponto2X, 2)) + (Math.pow(ponto1Y - ponto2Y, 2));
		double resultado = Math.sqrt(aux);
		
		JOptionPane.showMessageDialog(null, "A distância entre o ponto 1(" + ponto1X + ", " + ponto1Y + ") e ponto 2("
				+ ponto2X + ", " + ponto2Y + ") é: " + resultado, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}