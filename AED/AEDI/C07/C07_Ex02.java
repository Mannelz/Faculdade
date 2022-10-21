import javax.swing.JOptionPane;

public class C07_Ex02 
{
	public static void main(String[] args) 
	{
		String nota1Str, nota2Str, nota3Str;
		int nota1, nota2, nota3;
		
		nota1Str = JOptionPane.showInputDialog(null, "Informe o valor da primeira nota:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		nota1 = Integer.valueOf(nota1Str).intValue();
		
		nota2Str = JOptionPane.showInputDialog(null, "Informe o valor da segunda nota:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		nota2 = Integer.valueOf(nota2Str).intValue();
		
		nota3Str = JOptionPane.showInputDialog(null, "Informe o valor da terceira nota:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		nota3 = Integer.valueOf(nota3Str).intValue();
		
		int notaFinal = (nota1 + nota2 + nota3) / 3;
		String conceito;
		
		switch (notaFinal)
		{
			case 9: case 10:
				conceito = "A";
				break;
			
			case 8:
				conceito = "B";
				break;
				
			case 7:
				conceito = "C";
				break;
				
			case 5: case 6:
				conceito = "D";
				break;
				
			default:
				conceito = "E";
				break;
		}
		
		JOptionPane.showMessageDialog(null, "Nota 1: " + nota1 + "\nNota 2: " + nota2 +
				"\nNota 3: " + nota3 + "\nMédia: " + notaFinal + "\nConceito: " + conceito, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}