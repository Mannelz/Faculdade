import javax.swing.JOptionPane;

public class C05_Ex07 
{
	public static void main(String[] args)
	{
		String xStr;
		double x;
		
		xStr = JOptionPane.showInputDialog(null, "Informe o valor de X:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		x = Double.valueOf(xStr).doubleValue();
		
		double aux = Math.pow(x/4f + 1, 2) + 1/5f * x;
		double resultado = Math.sqrt(aux);
		
		JOptionPane.showMessageDialog(null, "O valor de f(" + x + ") é " + resultado, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}