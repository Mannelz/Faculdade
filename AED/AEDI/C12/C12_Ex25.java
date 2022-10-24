import java.util.Scanner;

public class C12_Ex25
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String frase;
		String palavras[];
		
		System.out.print("Escreva uma frase curta: ");
		frase = teclado.nextLine();
		
		palavras = frase.split(" ");
		
		for(int i = 0; i < palavras.length; i++)
		{
			System.out.println(palavras[i].substring(0, 1).toUpperCase() + palavras[i].substring(1));
		}
		
		teclado.close();
	}
}