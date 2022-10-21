import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class C06_Ex07 
{
	public static void main(String[] args) 
	{
		String salarioStr;
		double salario;
		
		salarioStr = JOptionPane.showInputDialog(null, "Informe o valor do seu salário:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		salario = Double.valueOf(salarioStr).doubleValue();
		
		double plBruto;
		
		if(salario <= 300)
		{
			plBruto = 500 + salario * 0.7;
		}
		else if(salario <= 1000)
		{
			plBruto = 200 + salario * 0.5;
		}
		else
		{
			plBruto = salario * 0.3;
		}
		
		double iR = plBruto * 0.25;
		double plLiquido = plBruto - iR;
		
		String salarioFormat = new DecimalFormat("#,##0.00").format(salario);
		String plLiquidoFormat = new DecimalFormat("#,##0.00").format(plLiquido);
		
		JOptionPane.showMessageDialog(null, "Salário: R$" + salarioFormat + "\nPL Líquido: R$" + plLiquidoFormat, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}