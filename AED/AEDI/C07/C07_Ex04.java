import javax.swing.JOptionPane;

public class C07_Ex04
{
	public static void main(String[] args)
	{
		String equipe, msg = "";
		
		equipe = JOptionPane.showInputDialog(null, "Informe o nome da equipe:", "Aula Java", JOptionPane.QUESTION_MESSAGE);
		
		switch(equipe)
		{
			case "Am�rica": case "Atl�tico": case /*B*/"Cruzeiro": case "Vila Nova":
				msg = "Estado de Minas Gerais";
				break;
				
			case "Botafogo": case "Flamengo": case "Fluminense": case "Vasco":
				msg = "Estado do Rio de Janeiro";
				break;
				
			case "Corinthians": case "Palmeiras": case "Santos": case "S�o Paulo":
				msg = "Estado de S�o Paulo";
				break;
				
			case "Gr�mio": case "Internacional": case "Juventude":
				msg = "Estado do Rio Grande do Sul";
				break;
				
			case "Na�tico": case "Santa Cruz": case "Sport":
				msg = "estado do Pernambuco";
				break;
		}
		
		JOptionPane.showMessageDialog(null, "A equipe do " + equipe + " pertence ao " + msg, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}