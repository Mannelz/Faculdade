import javax.swing.JOptionPane;

public class C08_Ex06
{
	public static void main(String[] args)
	{
		String numStr, resultado;
		int num, divisivel3 = 0, soma4 = 0;
		
		for(int i = 1; i <= 10; i++)
		{
			numStr = JOptionPane.showInputDialog(null, "Informe um n�mero inteiro:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			num = Integer.valueOf(numStr).intValue();
			
			if(num % 2 == 0)
			{
				resultado = num + " � par";
			}
			else
			{
				resultado = num + " � �mpar";
			}
			
			JOptionPane.showMessageDialog(null, resultado, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
			
			if(num % 3 == 0)
			{
				divisivel3++;
			}
			
			if(num % 4 == 0)
			{
				soma4 += num;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Soma dos n�meros divis�veis por 4: " + soma4 + 
				"\nQuantidade de n�meros divis�veis por 3: " + divisivel3, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}