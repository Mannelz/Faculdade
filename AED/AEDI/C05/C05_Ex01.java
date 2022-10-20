import javax.swing.JOptionPane;

public class C05_Ex01 
{
	public static void main(String[] args) 
	{
		String xStr;
		double x;
		
		xStr = JOptionPane.showInputDialog(null, "Informe o valor de x:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		x = Double.valueOf(xStr).doubleValue();
		
		double aux = Math.pow(x, 3) + 4 * x + 10;
		
		JOptionPane.showMessageDialog(null, "f(" + x + ") = " + aux, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}