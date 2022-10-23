import javax.swing.JOptionPane;

public class C08_Ex16 
{
	public static void main(String[] args) 
	{
		int soma = 0, cont = 0;
		double media;
		
		for(int i = 1000; i <= 2000; i++)
		{
			if(i % 2 != 0)
			{
				soma += i;
				cont++;
			}
		}
		
		media = soma / cont;
		JOptionPane.showMessageDialog(null, "Média dos números ímpares: " + media, "Aula Java", JOptionPane.INFORMATION_MESSAGE);
	}
}