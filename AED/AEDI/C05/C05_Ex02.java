import javax.swing.JOptionPane;

public class C05_Ex02 
{
	public static void main(String[] args) 
	{
		String raioStr;
		double raio, area, volume;
		
		double pi = 3.1416;
		
		raioStr = JOptionPane.showInputDialog(null, "Informe o valor do raio:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		raio = Double.valueOf(raioStr).doubleValue();
	
		area = 4 * pi * Math.pow(raio, 2);
		
		volume = (4/3f) * pi * Math.pow(raio, 3);
		
		JOptionPane.showMessageDialog(null, "Raio informado: " + raio + 
				"\n\nArea: " + area + "\nVolume: " + volume);
	}
}