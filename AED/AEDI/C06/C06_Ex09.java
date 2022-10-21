import javax.swing.JOptionPane;

public class C06_Ex09 
{
	public static void main(String[] args) 
	{
		String sexo, alturaStr;
		double altura, pesoIdeal = 0;
		
		alturaStr = JOptionPane.showInputDialog(null, "Informe a altura (em metros):", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		altura = Double.valueOf(alturaStr).doubleValue();
		
		sexo = JOptionPane.showInputDialog(null, "Informe o sexo (M/F):", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		
		if(sexo.equalsIgnoreCase("M"))
		{
			pesoIdeal = 72.7 * altura - 58;
		}
		else if(sexo.equalsIgnoreCase("F"))
		{
			pesoIdeal = 62.1 * altura - 44.7;
		}
		
		JOptionPane.showMessageDialog(null, "Altura: " + altura + 
				"Sexo: " + sexo + 
				"\nPeso ideal: " + pesoIdeal, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}