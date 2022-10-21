import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class C06_Ex03 
{
	public static void main(String[] args) 
	{
		String vendaStr;
		double salario, venda;
		double valorFix = 240f;
		
		vendaStr = JOptionPane.showInputDialog(null, "Informe o valor mensal da venda:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		venda = Double.valueOf(vendaStr).doubleValue();
		
		if(venda <= 1000)
		{
			salario = valorFix;
		}
		else if(venda <= 10000)
		{
			salario = valorFix + (venda * 0.10);
		}
		else
		{
			salario = valorFix + 1000;
		}
		
		String salarioFormat = new DecimalFormat("#,##0.00").format(salario);
		
		JOptionPane.showMessageDialog(null, "O salário é: R$" + salarioFormat, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}