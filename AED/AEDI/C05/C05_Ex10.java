import javax.swing.JOptionPane;

public class C05_Ex10 
{
	public static void main(String[] args) 
	{
		String numStr;
		int num;
		
		numStr = JOptionPane.showInputDialog(null, "Informe um n�mero inteiro de 5 d�gitos:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		num = Integer.valueOf(numStr).intValue();
		
		JOptionPane.showMessageDialog(null, "N�mero lido: " + num + "\n\n" + num / 10000 + 
				"\n" + num / 1000 % 10 + "\n" + num / 100 % 10 + "\n" + num % 100 / 10 + 
				"\n" + num % 10, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}