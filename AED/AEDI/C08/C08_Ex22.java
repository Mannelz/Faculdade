import javax.swing.JOptionPane;

public class C08_Ex22
{
	public static void main(String[] args)
	{
		String numStr;
		int num, cont = 0;
		
		numStr = JOptionPane.showInputDialog(null, "Informe um n�mero inteiro maior que zero:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		num = Integer.valueOf(numStr).intValue();
		
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0)
			{
				cont++;
			}
		}
		
		if(cont == 2)
		{
			JOptionPane.showMessageDialog(null, "O n�mero " + num + " � primo", "Aula Java", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O n�mero " + num + " n�o � primo", "Aula Java", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}