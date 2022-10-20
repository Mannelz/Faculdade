import javax.swing.JOptionPane;

public class C05_Ex05 
{
	public static void main(String[] args)
	{
		String celsiusStr;
		double celsius, kelvin, fahrenheit;
		
		celsiusStr = JOptionPane.showInputDialog(null, "Informe a temperatura(celsius):", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		celsius = Double.valueOf(celsiusStr).doubleValue();
		
		kelvin = celsius + 273;
		
		fahrenheit = ((celsius * 9) + 160) / 5;
		
		JOptionPane.showMessageDialog(null, "Temperatura(Cº): "  + celsius + "\n\nKelvin: " + kelvin +
				"\nFahrenheit: " + fahrenheit, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}