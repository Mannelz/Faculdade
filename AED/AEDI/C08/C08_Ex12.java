import javax.swing.JOptionPane;

public class C08_Ex12
{
	public static void main(String[] args) 
	{
		String codigoStr;
		int codigo;
		double faturamento, modelo1 = 0, modelo2 = 0, modelo3 = 0, modelo4 = 0, modelo5 = 0;
		
		for(int i = 1; i <= 1000; i++)
		{
			codigoStr = JOptionPane.showInputDialog(null, "Informe o código do modelo", "Aula Java", JOptionPane.QUESTION_MESSAGE);
			codigo = Integer.valueOf(codigoStr).intValue();
			
			switch(codigo)
			{
				case 1:
					modelo1 += 1565f;
					break;
					
				case 2:
					modelo2 += 1890f;
					break;
			
				case 3:
					modelo3 += 2150f;
					break;
			
				case 4:
					modelo4 += 2963f;
					break;
					
				case 5:
					modelo5 += 3750f;
					break;
			}
		}
		
		faturamento = modelo1 + modelo2 + modelo3 + modelo4 + modelo5;
		
		JOptionPane.showMessageDialog(null, "O faturamento foi de R$" + faturamento, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}