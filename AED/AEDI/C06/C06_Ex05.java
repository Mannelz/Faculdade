import javax.swing.JOptionPane;

public class C06_Ex05 
{
	public static void main(String[] args) 
	{
		String numStr, msg;
		int num;
		
		numStr = JOptionPane.showInputDialog(null, "Informe um n�mero inteiro:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		num = Integer.valueOf(numStr).intValue();
		
		if(num % 5 == 0 && num % 7 == 0)
		{
			msg = "O n�mero " + num + " � divis�vel por 5 e 7 simultaneamente.";
		}
		else
		{
			msg = "O n�mero " + num + " n�o � divis�vel por 5 e 7 simultaneamente.";
		}
		
		JOptionPane.showMessageDialog(null, msg, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}