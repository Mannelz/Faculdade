import java.util.Scanner;

public class C04_Ex01 
{
	public static void main(String[] args) 
	{
		String nome, nomeComposto, sobrenome;
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		
		System.out.print("Informe seu nome composto (caso tenha): ");
		nomeComposto = teclado.nextLine();
		
		System.out.print("Informe seu sobrenome: ");
		sobrenome = teclado.nextLine();
		
		System.out.print("Informe sua idade: ");
		idade = teclado.nextInt();
		
		System.out.println(sobrenome + ", " + nome + " " + nomeComposto);
		System.out.println("Idade: " + idade + " anos");
		teclado.close();
	}
}