import javax.swing.JOptionPane;

public class C05_Ex08
{
	public static void main(String[] args) 
	{
		String areaStr, anguloStr;
		double area, angulo;
		double pi = 3.1416;
		
		areaStr = JOptionPane.showInputDialog(null, "Informe o valor da �rea do setor:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		anguloStr = JOptionPane.showInputDialog(null, "Informe o �ngulo:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		
		area = Double.valueOf(areaStr).doubleValue();
		angulo = Double.valueOf(anguloStr).doubleValue();
		
		double aux = (area * 360) / (angulo * pi);
		double raio = Math.sqrt(aux);
		
		JOptionPane.showMessageDialog(null, "O valor do raio �: " + raio, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}