import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class C04_Ex05
{
	public static void main(String[] args) 
	{
		String nome, cpf, id, titulo, cartaMotor, nomeEmp;
		double salario;
		Scanner arquivo = new Scanner(C04_Ex05.class.getResourceAsStream("arquivo.txt"));
		
		nome = arquivo.nextLine();
		cpf = arquivo.nextLine();
		id = arquivo.nextLine();
		titulo = arquivo.nextLine();
		cartaMotor = arquivo.nextLine();
		nomeEmp = arquivo.nextLine();
		salario = arquivo.nextDouble();
		
		String salarioFormat = new DecimalFormat("#,##0.00").format(salario);
		
		JOptionPane.showMessageDialog(null, "FICHA FUNCIONAL DE: " + nome + 
				"\n\nDocumentos: \nCPF................................... " + cpf + "\nC.I. .................................... " + id + 
				"\nTítulo de eleitor.............. " + titulo + "\nCarteira de motorista... " + cartaMotor + 
				"\n\nEmpresa: " + nomeEmp + "\nSalário: R$" + salarioFormat, 
				"Aula Java", JOptionPane.INFORMATION_MESSAGE);
		
		arquivo.close();
	}
}