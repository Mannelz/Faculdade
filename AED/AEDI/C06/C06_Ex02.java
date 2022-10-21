import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class C06_Ex02
{
	public static void main(String[] args) 
	{
		String qntPoluenteStr;
		double qntPoluente;
		double multa;
		
		qntPoluenteStr = JOptionPane.showInputDialog(null, "Informe a quantidade de poluente(s) emitido(s):", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		qntPoluente = Double.valueOf(qntPoluenteStr).doubleValue();
		
		if(qntPoluente <= 1500)
		{
			multa = 0;
		}
		else if(qntPoluente <= 3500)
		{
			multa = 3000;
		}
		else
		{
			multa = 5000 * qntPoluente;
		}
		
		String multaFormat = new DecimalFormat("#,##0.00").format(multa);
		
		JOptionPane.showMessageDialog(null, "Quantidade de poluente(s): " + qntPoluente +
				"\nMulta: R$" + multaFormat, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}