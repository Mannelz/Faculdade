import javax.swing.JOptionPane;

public class C08_Ex30
{
	*
	public static void main(String[] args)
	{
		String valorXStr, valorNStr;
		int valorX, valorN;
		
		valorXStr = JOptionPane.showInputDialog(null, "Informe o valor de X", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		valorX = Integer.valueOf(valorXStr).intValue();
		
		valorNStr = JOptionPane.showInputDialog(null, "Informe o valor de N", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		valorN = Integer.valueOf(valorNStr).intValue();
	}
}