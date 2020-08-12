package Integracion;
/**
 *
 * @Juan Guerrero
 */
public class Cuadrado extends Figuras_Geometricas
{
    private double lado1;

    public Cuadrado(double lado1) 
    {
        super(4);
        this.lado1 = lado1;
    }

    public double getLado1()
    {
        return lado1;
    }

    public void setLado1(double lado1)
    {
        this.lado1 = lado1;
    }

    @Override
    public String toString() 
    {
        return "Cuadrado= " + super.toString() + "\nlado1= " + lado1 + ", lado2=" + lado1 + ", lado3= "+ lado1 + ", lado4= " + lado1;
    }
    
    @Override
    public double area()
    {
        return lado1 * lado1;
    }
    
    @Override
    public double perimetro()
    {
       return lado1 + lado1 + lado1 + lado1; 
    }
}