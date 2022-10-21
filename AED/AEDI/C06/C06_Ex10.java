import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class C06_Ex10 
{
	public static void main(String[] args) 
	{
		String capitalStr, diasStr, taxaStr;
		double capital, dias, taxa;
		
		capitalStr = JOptionPane.showInputDialog(null, "Qual foi o capital investido?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		capital = Double.valueOf(capitalStr).doubleValue();
		
		diasStr = JOptionPane.showInputDialog(null, "Quantos dias o dinheiro ficou aplicado?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		dias = Double.valueOf(diasStr).doubleValue();
		
		taxaStr = JOptionPane.showInputDialog(null,"Qual a taxa diária(%)?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		taxa = Double.valueOf(taxaStr).doubleValue();
		
		taxa /= 100;
		
		double rendimento = capital * taxa * dias;
		double iR = rendimento * 0.15;
		double resgate = capital + rendimento - iR - 10;
		
		String capitalFormat = new DecimalFormat("#,##0.00").format(capital);
		String rendimentoFormat = new DecimalFormat("#,##0.00").format(rendimento);
		String iRFormat = new DecimalFormat("#,##0.00").format(iR);
		String resgateFormat = new DecimalFormat("#,##0.00").format(resgate);
		
		JOptionPane.showMessageDialog(null, "Capital investido: R$" + capitalFormat + 
				"\n\nRendimento: R$" + rendimentoFormat + 
				"\nImposto de Renda: R$" + iRFormat + 
				"\nValor a ser resgatado: R$" + resgateFormat, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}