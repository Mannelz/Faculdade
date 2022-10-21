import javax.swing.JOptionPane;

public class C06_Ex04
{
	public static void main(String[] args)
	{
		String nome, alturaStr, pesoStr;
		double altura, peso;
		
		nome = JOptionPane.showInputDialog(null, "Qual o seu nome?", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		alturaStr = JOptionPane.showInputDialog(null, "Olá " + nome + ", por favor, informe sua altura:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		pesoStr = JOptionPane.showInputDialog(null, "Informe seu peso:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		
		altura = Double.valueOf(alturaStr).doubleValue();
		peso = Double.valueOf(pesoStr).doubleValue();
		
		double imc = peso / Math.pow(altura, 2);
		
		String msg;
		
		if(imc < 18)
		{
			msg = nome + " está desnutrido(a)";
		}
		else if(imc < 20)
		{
			msg = nome + " está abaixo do peso";
		}
		else if(imc <= 25)
		{
			msg = nome + " está no peso ideal";
		}
		else if(imc < 27)
		{
			msg = nome + " está acima do peso";
		}
		else
		{
			msg = nome + " está obeso(a)";
		}
		
		JOptionPane.showMessageDialog(null, msg, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}