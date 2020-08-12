package Integracion;
/**
 *
 * @Juan Guerrero
 */
public class Circulo extends Figuras_Geometricas
{
    private double radio;
    private static final double PI = Math.PI;

    public Circulo(double radio) {
        super(1);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo= " + "radio=" + radio  ;
    }
    
    @Override
    public double area()
    {
        return PI * (radio * radio);
    }
    
    @Override
    public double perimetro()
    {
       return radio * 2 * PI;
    }
}
