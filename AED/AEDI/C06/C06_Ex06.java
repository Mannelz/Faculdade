import javax.swing.JOptionPane;

public class C06_Ex06
{
	public static void main(String[] args) 
	{
		String valorAStr, valorBStr, valorCStr;
		double valorA, valorB, valorC, raiz1, raiz2;
		
		valorAStr = JOptionPane.showInputDialog(null, "Informe o valor de A:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		valorA = Double.valueOf(valorAStr).doubleValue();
		
		valorBStr = JOptionPane.showInputDialog(null, "Informe o valor de B:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		valorB = Double.valueOf(valorBStr).doubleValue();
		
		valorCStr = JOptionPane.showInputDialog(null, "Informe o valor de C:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		valorC = Double.valueOf(valorCStr).doubleValue();
		
		double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;

		String msg;
		
		if(delta > 0)
		{
			raiz1 = (-(valorB) + (Math.sqrt(delta))) / (2 * valorA);
			raiz2 = (-(valorB) - (Math.sqrt(delta))) / (2 * valorA);
			
			msg = "Temos 2 raízes reais: " + raiz1 + ", " + raiz2;
		}
		else if(delta < 0)
		{
			msg = "Não temos raízes reais.";
		}
		else
		{
			raiz1 = (-(valorB) + (Math.sqrt(delta))) / (2 * valorA);
			
			msg = "Temos 1 raíz real: " + raiz1;
		}
		
		JOptionPane.showMessageDialog(null, msg, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}