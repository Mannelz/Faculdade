public class Funcionario
{
    private String nome;
    private String cargo;
    private String end;
    private int idade;
    private double salario;

    public void Exibe()
    {
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nEndereço: " + getEnd() + "\nCargo: " + getCargo() + "\nSalário: " + getSalario());
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCargo()
    {
        return cargo;
    }

    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    public String getEnd()
    {
        return end;
    }

    public void setEnd(String end)
    {
        this.end = end;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }
}