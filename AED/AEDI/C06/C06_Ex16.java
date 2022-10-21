import javax.swing.JOptionPane;

public class C06_Ex16
{
	public static void main(String[] args)
	{
		String nota1Str, nota2Str, nota3Str, trabalhoFinalStr, faltasStr, idadeStr;
		double nota1, nota2, nota3, trabalhoFinal;
		int faltas, idade, peso1, peso2;
		
		faltasStr = JOptionPane.showInputDialog(null, "Informe a quantidade de faltas:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		faltas = Integer.valueOf(faltasStr).intValue();
		
		nota1Str = JOptionPane.showInputDialog(null, "Informe a nota da primeira prova:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		nota1 = Double.valueOf(nota1Str).doubleValue();
		
		nota2Str = JOptionPane.showInputDialog(null, "Informe a nota da segunda prova:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		nota2 = Double.valueOf(nota2Str).doubleValue();
		
		nota3Str = JOptionPane.showInputDialog(null, "Informe a nota da terceira prova:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		nota3 = Double.valueOf(nota3Str).doubleValue();
		
		trabalhoFinalStr = JOptionPane.showInputDialog(null, "Informe a nota do trabalho final:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		trabalhoFinal = Double.valueOf(trabalhoFinalStr).doubleValue();
		
		idadeStr = JOptionPane.showInputDialog(null, "Informe sua idade:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		idade = Integer.valueOf(idadeStr).intValue();
		
		if(faltas <= 5)
		{
			peso1 = 3;
		}
		else if(faltas <= 10)
		{
			peso1 = 2;
		}
		else
		{
			peso1 = 1;
		}
		
		if(idade <= 17)
		{
			peso2 = 1;
		}
		else if(idade <= 50)
		{
			peso2 = 2;
		}
		else
		{
			peso2 = 3;
		}
		
		double media;
		
		if(nota1 > nota3 && nota2 > nota3)
		{
			media = (nota1 + nota2) / 2;
		}
		else if(nota1 > nota2 && nota3 > nota2)
		{
			media = (nota1 + nota3) / 2;
		}
		else
		{
			media = (nota2 + nota3) / 2;
		}
		
		double notaFinal = media * peso1 + trabalhoFinal * peso2;
		String resultado;
		
		if(notaFinal <= 50)
		{
			resultado = "Reprovado"; 
		}
		else if(notaFinal <= 70)
		{
			resultado = "Regular";
		}
		else if(notaFinal <= 80)
		{
			resultado = "Bom";
		}
		else if(notaFinal <= 90)
		{
			resultado = "Muito Bom";
		}
		else
		{
			resultado = "Excelente";
		}
		
		JOptionPane.showMessageDialog(null, "Nota Final: " + notaFinal + "\nResultado: " + resultado, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}