package Integracion;
/**
 *
 * @Juan Guerrero
 */
public class Trapecio extends Figuras_Geometricas
{
    private double bassup;
    private double basinf;
    private double lat1;
    private double h;

    public Trapecio(double bassup, double basinf, double lat1, double h) 
    {
        super(4);
        this.bassup = bassup;
        this.basinf = basinf;
        this.lat1 = lat1;
        this.h = h;
    }

    public double getBassup() 
    {
        return bassup;
    }

    public void setBassup(double bassup) 
    {
        this.bassup = bassup;
    }

    public double getBasinf() 
    {
        return basinf;
    }

    public void setBasinf(double basinf) 
    {
        this.basinf = basinf;
    }

    public double getLat1() {
        return lat1;
    }

    public void setLat1(double lat1) 
    {
        this.lat1 = lat1;
    }

    public double getH() 
    {
        return h;
    }

    public void setH(double h) 
    {
        this.h = h;
    }
    
    @Override
    public double area()
    {
        return ((bassup + basinf) * h) / 2;
    }
    @Override
    public double perimetro()
    {
        return basinf + bassup + (lat1 * 2);
    }
}
