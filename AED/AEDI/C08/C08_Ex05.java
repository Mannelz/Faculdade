import javax.swing.JOptionPane;

public class C08_Ex05
{
	public static void main(String[] args)
	{
		String votoStr;
		int voto;
		int votoFulano = 0, votoCiclano = 0, votoBeltrano = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			votoStr = JOptionPane.showInputDialog(null, "Informe seu voto (1/2/3)", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			voto = Integer.valueOf(votoStr).intValue();
			
			switch(voto)
			{
				case 1:
					votoFulano++;
					break;
					
				case 2: 
					votoCiclano++;
					break;
					
				case 3:
					votoBeltrano++;
					break;
			}
		}
		
		JOptionPane.showMessageDialog(null, "RESULTADO\n\nFulano: " + votoFulano + 
				"\nCiclano: " + votoCiclano + 
				"\nBeltrano: " + votoBeltrano, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}