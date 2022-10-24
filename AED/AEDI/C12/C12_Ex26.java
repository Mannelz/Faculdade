import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_Ex26
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int cpf = 0, cpfQualquer, pos = -1;
		String resposta, novoEnd;
		List<Integer> cpfList = new ArrayList<Integer>();
		List<String> endList = new ArrayList<String>();
		
		do
		{
			System.out.print("Informe o CPF: ");
			cpf = teclado.nextInt();
			
			if(cpf != 0)
			{
				cpfList.add(cpf);
			
				teclado.nextLine();
				
				System.out.print("Informe o endereço: ");
				endList.add(teclado.nextLine());
			}
		}
		while(cpf != 0);
		
		System.out.print("Informe o CPF que deseja pesquisar: ");
		cpfQualquer = teclado.nextInt();
		
		teclado.nextLine();
		
		for(int i = 0; i < cpfList.size(); i++)
		{
			if(cpfList.get(i) == cpfQualquer)
			{
				pos = i;
				
				break;
			}
		}
		
		if(pos != -1)
		{
			System.out.println("CPF encontrado com sucesso! Deseja 'alterar' ou 'excluir'?");
			resposta = teclado.nextLine();
			
			if(resposta.equalsIgnoreCase("Alterar"))
			{
				System.out.print("Informe o novo endereço: ");
				novoEnd = teclado.nextLine();
				
				endList.set(pos, novoEnd);
				
				System.out.println("Endereço alterado com sucesso!");
			}
			else
			{
				cpfList.remove(pos);
				endList.remove(pos);
				
				System.out.println("CPF e endereço removidos com sucesso!");
			}
		}
		else
		{
			System.out.println("CPF não encontrado!");
		}
		
		teclado.close();
	}
}