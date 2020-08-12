package Integracion;
/**
 *
 * @Juan Guerrero
 */
public class Paralelogramo extends Figuras_Geometricas
{
    private double a;
    private double b;
    private double h;

    public Paralelogramo(double a, double b, double h) 
    {
        super(4);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() 
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double getB() 
    {
        return b;
    }

    public void setB(double b) 
    {
        this.b = b;
    }
    
    public double getH(){
        return h;
    }
    
    public void setH(double h)
    {
        this.h = h;
    }
    
    @Override
    public String toString()
    {
        return "Paralelogramo= " + super.toString() + "a= " + a + ", b= " + b;
    }
    
    @Override
    public double area()
    {
        return b * h;
    }
    
    @Override
    public double perimetro()
    {
        return (a + b) * 2;
    }
}
