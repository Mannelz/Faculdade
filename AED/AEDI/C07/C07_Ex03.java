import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class C07_Ex03 
{
	public static void main(String[] args) 
	{
		String diasStr, impostoStr;
		int dias;
		double imposto, multa;
		
		impostoStr = JOptionPane.showInputDialog(null, "Informe o valor do imposto:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		imposto = Double.valueOf(impostoStr).doubleValue();
		
		diasStr = JOptionPane.showInputDialog(null, "Informe a quantidade de dias atrasados", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		dias = Integer.valueOf(diasStr).intValue();
		
		switch (dias)
		{
			case 1: case 2: case 3: case 4: case 5:
				multa = 0;
				break;
				
			case 6: case 7: case 8:
				multa = imposto * 0.02;
				break;
				
			case 9: case 10: 
				multa = (imposto * 0.1) + (0.05 * dias);
				break;
				
			default:
				multa = (imposto * 1.5) + (1 * dias);
		}
		
		String impostoFormat = new DecimalFormat("#,##0.00").format(imposto);
		String multaFormat = new DecimalFormat("#,##0.00").format(multa);
		
		JOptionPane.showMessageDialog(null, "Imposto: R$" + impostoFormat + "\nDias de atraso: " + dias + "\nMulta: R$" + multaFormat, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}