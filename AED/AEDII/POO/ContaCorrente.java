public class ContaCorrente
{
    private int num;
    private int agencia;
    private double saldo;

    public void inicializarContaCorrente(int num, int agencia)
    {
        this.num = num;
        this.agencia = agencia;
        saldo = 0;
    }

    public void Sacar(double valor)
    {
        if(valor > saldo)
        {
            System.out.println("Valor inválido!");
        }
        else
        {
            saldo -= valor;
        }
    }

    public void Depositar(double valor)
    {
        saldo += valor;
    }

    public double ConsultarSaldo()
    {
        return saldo;
    }

    public void Exibe()
    {
        System.out.println("Número: " + num + "\nAgência: " + agencia + "\nSaldo: " + saldo);
    }
}