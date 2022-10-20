public class Circulo
{
    private int x;
    private int y;
    private double raio;

    public Circulo()
    {
        raio = x = y = 0;
    }

    public Circulo(int x, int y, double raio)
    {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public double Area()
    {
        return Math.PI * Math.pow(raio, 2);
    }

    public double Perimetro()
    {
        return 2 * Math.PI * raio;
    }

    public void MoveX(int deltaX)
    {
        x += deltaX;
    }

    public void MoveY(int deltaY)
    {
        y += deltaY;
    }

    public void Aumentar(int deltaR)
    {
        raio *= deltaR;
    }

    public void Exibe()
    {
        System.out.println("Centro (" + x + ", " + y + ")\nRaio: " + raio + "\nÁrea: " + Area() + "\nPerímetro: " + Perimetro());
    }
}