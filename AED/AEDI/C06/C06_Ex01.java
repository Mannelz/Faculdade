import javax.swing.JOptionPane;

public class C06_Ex01
{
	public static void main(String[] args) 
	{
		String xStr;
		double x, fx;
		
		xStr = JOptionPane.showInputDialog(null, "Informe o valor de X:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		x = Double.valueOf(xStr).doubleValue();
		
		if(x < 4)
		{
			fx = (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2));
		}
		else if(x > 4)
		{
			fx = (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
		}
		else
		{
			fx = 0;
		}
		
		JOptionPane.showMessageDialog(null, "O valor de f(" + x + ") é: " + fx, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}