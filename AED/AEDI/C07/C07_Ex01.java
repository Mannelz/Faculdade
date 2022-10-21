import javax.swing.JOptionPane;

public class C07_Ex01 
{
	public static void main(String[] args)
	{
		String nome, acertosStr, premio;
		int acertos;
		
		nome = JOptionPane.showInputDialog(null, "Qual seu nome?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		
		acertosStr = JOptionPane.showInputDialog(null, "Ol� " + nome + ", informe a quantidade de acertos:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		acertos = Integer.valueOf(acertosStr).intValue();
		
		switch(acertos)
		{
			case 6: case 7: case 8: case 9: case 10:
				premio = "Ganha outro cart�o";
				break;
				
			case 11:
				premio = "Pr�mio de R$100,00";
				break;
				
			case 12:
				premio = "Pr�mio de R$1.000,00";
				break;
				
			case 13:
				premio = "Pr�mio de R$50.000,00";
				break;
				
			default:
				premio = "Nenhum pr�mio";
				break;
		}
		
		JOptionPane.showMessageDialog(null, nome + ", acertos: " + acertos + "\n\n" + premio, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}