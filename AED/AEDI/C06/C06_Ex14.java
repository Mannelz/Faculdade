import javax.swing.JOptionPane;

public class C06_Ex14
{
	public static void main(String[] args)
	{
		String numStr;
		int num;
		
		numStr = JOptionPane.showInputDialog(null, "Informe um n�mero inteiro de 4 d�gitos:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		num = Integer.valueOf(numStr).intValue();
		
		if(num < 1000 || num > 9999)
		{
			JOptionPane.showMessageDialog(null, "ERROR: O n�mero informado deve conter 4 d�gitos!", "Aula Java", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			String msg;
			
			msg = Integer.toString(num % 10) + Integer.toString(num % 100 / 10) + Integer.toString(num / 100 % 10) + Integer.toString(num / 1000); 
			
			JOptionPane.showMessageDialog(null, "N�mero: " + num + "\nN�mero ao contr�rio: " + msg, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}