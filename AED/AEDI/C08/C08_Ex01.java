import javax.swing.JOptionPane;

public class C08_Ex01
{
	public static void main(String[] args)
	{
		String raioStr;
		double raio, area;
		double pi = 3.1416;
		
		for(int i = 1; i <= 10; i++)
		{
			raioStr = JOptionPane.showInputDialog(null, "Informe o raio:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			raio = Double.valueOf(raioStr).doubleValue();
			
			area = pi * Math.pow(raio, 2);
			
			JOptionPane.showMessageDialog(null, "Área do círculo com raio " + raio + " é: " + area, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}