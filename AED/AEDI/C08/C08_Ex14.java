import javax.swing.JOptionPane;

public class C08_Ex14
{
	public static void main(String[] args)
	{
		String numStr, simboloStr;
		char simbolo;
		int num;
		
		numStr = JOptionPane.showInputDialog(null, "Informe um número inteiro entre 1 e 20", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		num = Integer.valueOf(numStr).intValue();
		
		simboloStr = JOptionPane.showInputDialog(null, "Informe um símbolo", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		simbolo = simboloStr.charAt(0);
		
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= num; j++)
			{
				System.out.print(simbolo + " ");
			}
			
			System.out.println();
		}
	}
}