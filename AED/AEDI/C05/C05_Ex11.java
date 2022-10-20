import javax.swing.JOptionPane;

public class C05_Ex11 
{
	public static void main(String[] args) 
	{
		String numChequeStr;
		int numCheque;
		
		numChequeStr = JOptionPane.showInputDialog(null, "Informe o número do cheque:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		numCheque = Integer.valueOf(numChequeStr).intValue();
		
		int banco = numCheque / 1000000;
		int agencia = numCheque / 1000 % 1000; 
		int sequencial = numCheque % 1000;
		
		JOptionPane.showMessageDialog(null, "Número do cheque: " + numCheque + 
				"\n\nBanco: " + banco + "\nAgência: " + agencia + 
				"\nSequencial: " + sequencial, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}