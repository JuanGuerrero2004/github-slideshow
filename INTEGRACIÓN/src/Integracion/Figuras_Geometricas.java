package Integracion;
/**
 *
 * @Juan Guerrero
 */
public abstract class Figuras_Geometricas 
{
   protected int numLados;

    public Figuras_Geometricas(int numLados) 
    {
        this.numLados = numLados;
    }

    public int getNumLados()
    {
        return numLados;
    }

    @Override
    public String toString() 
    {
        return "Numero Lados=" + numLados;
    }
   
    //////////////DECLARAMOS EL METODO AREA COMO ABSTRACTO//////////////////
    public abstract double area();
   
    //////////////DECLARAMOS EL METODO PERIMETRO COMO ABSTRACTO/////////////////
    public abstract double perimetro();
}
