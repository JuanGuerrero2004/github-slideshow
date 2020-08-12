package Integracion;
/**
 *
 * @Juan Guerrero
 */
public class Cometa extends Figuras_Geometricas
{
    private double diag1;
    private double diag2;

    public Cometa(double diag1, double diag2) 
    {
        super(4);
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    public double getDiag1() {
        return diag1;
    }

    public void setDiag1(double diag1) {
        this.diag1 = diag1;
    }

    public double getDiag2() {
        return diag2;
    }

    public void setDiag2(double diag2) {
        this.diag2 = diag2;
    }

    @Override
    public String toString() {
        return "Cometa= " + super.toString() + "diag1= " + diag1 + ", diag2= " + diag2;
    }
    
    @Override
    public double area()
    {
        return (diag1 * diag2)/2;
    }
    
    @Override
    public double perimetro()
    {
        return Math.sqrt((((diag1 / 3) * (diag1 / 3)) + ((diag2 / 2) * (diag2 / 2)))) * 2 + Math.sqrt((((diag1 / 3 * 2) * (diag1 / 3 * 2)) + ((diag2 / 2) * (diag2 / 2)))) * 2 ; 
    }
}