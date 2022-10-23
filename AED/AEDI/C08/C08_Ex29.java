import javax.swing.JOptionPane;

public class C08_Ex29
{
	*
	public static void main(String[] args)
	{
		String num1Str, num2Str;
		int num1, num2;
		
		num1Str = JOptionPane.showInputDialog(null, "Informe um número inteiro", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		num1 = Integer.valueOf(num1Str).intValue();
		
		num2Str = JOptionPane.showInputDialog(null, "Informe outro número inteiro", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		num2 = Integer.valueOf(num2Str).intValue();
	}
}