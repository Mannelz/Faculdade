import javax.swing.JOptionPane;

public class C06_Ex17
{
	public static void main(String[] args)
	{
		int quest1, quest2, quest3, quest4, quest5, quest6, quest7, quest8, quest9;
		
		quest1 = JOptionPane.showConfirmDialog(null, "Voc� tem curso t�cnico de programa��o?", "Aula Java", JOptionPane.YES_NO_OPTION);
		quest2 = JOptionPane.showConfirmDialog(null, "Voc� tem curso superior de programa��o?", "Aula Java", JOptionPane.YES_NO_OPTION);
		quest3 = JOptionPane.showConfirmDialog(null, "Voc� tem menos de 3 anos de experi�ncia em programa��o?", "Aula Java", JOptionPane.YES_NO_OPTION);
		quest4 = JOptionPane.showConfirmDialog(null, "Voc� se considera uma pessoa criativa?", "Aula Java", JOptionPane.YES_NO_OPTION);
		quest5 = JOptionPane.showConfirmDialog(null, "Voc� prefere liderar a ser liderado?", "Aula Java", JOptionPane.YES_NO_OPTION);
		quest6 = JOptionPane.showConfirmDialog(null, "Voc� prefere trabalhar sozinho a trabalhar em equipe?", "Aula Java", JOptionPane.YES_NO_OPTION);
		quest7 = JOptionPane.showConfirmDialog(null, "Voc� � autodidata (aprende sozinho)?", "Aula Java", JOptionPane.YES_NO_OPTION);
		quest8 = JOptionPane.showConfirmDialog(null, "Voc� aceitaria uma remunera��o inicial de R$1500?", "Aula Java", JOptionPane.YES_NO_OPTION);
		quest9 = JOptionPane.showConfirmDialog(null, "Voc� s� aceitaria trabalhar em escrit�rios da empresa dentro da grande BH?", "Aula Java", JOptionPane.YES_NO_OPTION);
		
		boolean item1, item2;
		String resultado;
		
		if(quest1 == 0 && quest3 == 0 || quest2 == 0)
		{
			item1 = true;
		}
		else
		{
			item1 = false;
		}
		
		if(quest5 == 0 && quest8 == 0)
		{
			item2 = false;
		}
		else
		{
			item2 = true;
		}
		
		if(item1 == true && item2 == true && quest4 == 0 && quest6 == 1 && quest7 == 0 && quest9 == 1)
		{
			resultado = "O candidato est� apto a exercer a fun��o de programador na empresa.";
		}
		else
		{
			resultado = "O candidato n�o est� apto a exercer a fun��o de programador na empresa.";
		}
		
		JOptionPane.showMessageDialog(null, resultado, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}