import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class C06_Ex15
{
	public static void main(String[] args)
	{
		String cidade, codigoStr, diasStr, valorServicosStr;
		int codigo, dias;
		double valorServicos;
		
		codigoStr = JOptionPane.showInputDialog(null, "Informe o código do pacote:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		codigo = Integer.valueOf(codigoStr).intValue();
		
		diasStr = JOptionPane.showInputDialog(null, "Informe a quantidade de dias de consumo de canais pay-per-view:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		dias = Integer.valueOf(diasStr).intValue();
		
		valorServicosStr = JOptionPane.showInputDialog(null, "Informe o valor dos serviços extras:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		valorServicos = Double.valueOf(valorServicosStr).doubleValue();
		
		cidade = JOptionPane.showInputDialog(null, "Informe a sua cidade:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		
		double imposto;
		double valorFixo = 0;
		double diaria = 0;
		
		if(codigo == 1)
		{
			valorFixo = 65.00;
			diaria = dias * 1.20;
			
			if(diaria > 65)
			{
				diaria = 65.00;
			}
		}
		else if(codigo == 2)
		{
			valorFixo = 104.00;
			diaria = dias * 2.10;
		}
		else if(codigo == 3)
		{
			valorFixo = 137.00;
			diaria = 0;
		}
		
		if(cidade.equalsIgnoreCase("Belo Horizonte"))
		{
			imposto = 0;
		}
		else if(cidade.equalsIgnoreCase("São Paulo"))
		{
			imposto = 0.01;
		}
		else if(cidade.equalsIgnoreCase("Rio de Janeiro"))
		{
			imposto = 0.015;
		}
		else
		{
			imposto = 0.02;
		}
		
		double impostoTotal = (valorFixo + diaria + valorServicos) * imposto;
		double conta = valorFixo + diaria + valorServicos + impostoTotal;
		
		String contaFormat = new DecimalFormat("#,##0.00").format(conta);
		
		JOptionPane.showMessageDialog(null, "Valor da conta: R$" + contaFormat, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}