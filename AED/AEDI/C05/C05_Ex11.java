import javax.swing.JOptionPane;

public class C05_Ex11 
{
	public static void main(String[] args) 
	{
		String numChequeStr;
		int numCheque;
		
		numChequeStr = JOptionPane.showInputDialog(null, "Informe o n�mero do cheque:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		numCheque = Integer.valueOf(numChequeStr).intValue();
		
		int banco = numCheque / 1000000;
		int agencia = numCheque / 1000 % 1000; 
		int sequencial = numCheque % 1000;
		
		JOptionPane.showMessageDialog(null, "N�mero do cheque: " + numCheque + 
				"\n\nBanco: " + banco + "\nAg�ncia: " + agencia + 
				"\nSequencial: " + sequencial, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}