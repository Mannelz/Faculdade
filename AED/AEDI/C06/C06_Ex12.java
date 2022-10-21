import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class C06_Ex12 
{
	public static void main(String[] args) 
	{
		String prodBolasStr, bolasDefeitoStr, caixaUnitStr, mesesStr, aluguelStr;
		int prodBolas, bolasDefeito, meses;
		double caixaUnit, aluguel;
		
		prodBolasStr = JOptionPane.showInputDialog(null, "Informe a quantidade de bolas produzidas:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		prodBolas = Integer.valueOf(prodBolasStr).intValue();
		
		bolasDefeitoStr = JOptionPane.showInputDialog(null, "Informe a quantidade de bolas defeituosas", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		bolasDefeito = Integer.valueOf(bolasDefeitoStr).intValue();
		
		caixaUnitStr = JOptionPane.showInputDialog(null, "Informe o valor unitário da caixa:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		caixaUnit = Double.valueOf(caixaUnitStr).doubleValue();
		
		mesesStr = JOptionPane.showInputDialog(null, "Informe os meses faltantes para a Copa:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		meses = Integer.valueOf(mesesStr).intValue();
		
		aluguelStr = JOptionPane.showInputDialog(null, "Informe o valor mensal do aluguel:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		aluguel = Double.valueOf(aluguelStr).doubleValue();
		
		int bolasTot = prodBolas - bolasDefeito;
		int caixasTot = bolasTot / 10;
		int galpoesTot = caixasTot / 850;
		
		int restoBolas = bolasTot % 10;
		int restoCaixas = caixasTot % 850;
		
		if(restoBolas > 0)
		{
			caixasTot += 1;
		}
		
		if(restoCaixas > 0)
		{
			galpoesTot += 1;
		}
		
		double aluguelTot = meses * aluguel;
		double custoCaixas = caixasTot * caixaUnit;
		double custoGalpoes = galpoesTot * aluguelTot;
		double custoTot = custoCaixas + custoGalpoes;
		
		String custoTotFormat = new DecimalFormat("#,##0.00").format(custoTot);
		
		JOptionPane.showMessageDialog(null, "Custo Total: R$" + custoTotFormat, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}