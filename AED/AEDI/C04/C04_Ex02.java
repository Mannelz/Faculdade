import java.text.DecimalFormat;
import java.util.Scanner;

public class C04_Ex02 
{
	public static void main(String[] args) 
	{
		String nome, cpf, identidade, titulo, cartaMotor, nomeEmp;
		double salario;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		
		System.out.print("Informe seu CPF: ");
		cpf = teclado.nextLine();
		
		System.out.print("Informe sua identidade: ");
		identidade = teclado.nextLine();
		
		System.out.print("Informe seu t�tulo de eleitor: ");
		titulo = teclado.nextLine();
		
		System.out.print("Informe sua carteira de motorista: ");
		cartaMotor = teclado.nextLine();
		
		System.out.print("Informe seu sal�rio: ");
		salario = teclado.nextDouble();
		String salarioFormat = new DecimalFormat("#,##0.00").format(salario);
		
		teclado.nextLine();
		
		System.out.print("Informe o nome da empresa: ");
		nomeEmp = teclado.nextLine();
		
		System.out.println("");
		
		System.out.println("FICHA FUNCIONAL DE: " + nome);
		System.out.println("");
		System.out.println("Documentos:");
		System.out.println("CPF..................... " + cpf);
		System.out.println("C I..................... " + identidade);
		System.out.println("T�tulo de eleitor....... " + titulo);
		System.out.println("Carteira de motorista... " + cartaMotor);
		System.out.println("");
		System.out.println("Empresa: " + nomeEmp);
		System.out.println("Sal�rio: R$" + salarioFormat);

		teclado.close();
	}
}