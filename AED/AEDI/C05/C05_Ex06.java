import javax.swing.JOptionPane;

public class C05_Ex06 
{
	public static void main(String[] args) 
	{
		String valorAStr, valorBStr, valorCStr;
		String pontoXStr, pontoYStr;
		
		double valorA, valorB, valorC;
		double pontoX, pontoY;
		
		valorAStr = JOptionPane.showInputDialog(null, "Informe o valor de A:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		
		valorBStr = JOptionPane.showInputDialog(null, "Informe o valor de B:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		
		valorCStr = JOptionPane.showInputDialog(null, "Informe o valor de C:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		
		pontoXStr = JOptionPane.showInputDialog(null, "Informe o valor de X do ponto:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		
		pontoYStr = JOptionPane.showInputDialog(null, "Informe o valor de Y do ponto:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		
		valorA = Double.valueOf(valorAStr).doubleValue();
		
		valorB = Double.valueOf(valorBStr).doubleValue();
		
		valorC = Double.valueOf(valorCStr).doubleValue();
		
		pontoX = Double.valueOf(pontoXStr).doubleValue();
		
		pontoY = Double.valueOf(pontoYStr).doubleValue();
		
		double reta = valorA * pontoX + valorB * pontoY + valorC;
		double distancia = reta / Math.sqrt(Math.pow(valorA, 2) + Math.pow(valorB, 2)); 
		
		JOptionPane.showMessageDialog(null, "A distância entre a reta R e o ponto(" + pontoX + ", " + pontoY + ") é: " + distancia, "Aula Java", JOptionPane.QUESTION_MESSAGE);
	}
}