import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class C05_Ex03
{
	public static void main(String[] args) 
	{
		String numDepStr, salarioStr;
		
		int numDependentes;
		double salario;
		
		salarioStr = JOptionPane.showInputDialog(null, "Informe o seu salário:", "Java Aula", JOptionPane.QUESTION_MESSAGE);
		numDepStr = JOptionPane.showInputDialog(null, "Informe o número de dependentes:", "Aula JAva", JOptionPane.QUESTION_MESSAGE);
		
		numDependentes = Integer.valueOf(numDepStr).intValue();
		salario = Double.valueOf(salarioStr).doubleValue();
		
		double liquido = salario - (numDependentes * 60f);
		double iR = 0.15 * liquido;
		
		String salarioFormat = new DecimalFormat("#,##0.00").format(salario);
		String iRFormat = new DecimalFormat("#,##0.00").format(iR);
		
		JOptionPane.showMessageDialog(null, "O imposto de renda para o salário de R$" + salarioFormat + " e " + numDependentes + " dependente(s) é de: " + iRFormat, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}