
package Centro_Hospitalario;

/**
 *
 * @Juan Guerrero
 */
public class Persona 
{
    String nombre;
    int edad;
    char sexo;
    int cedula;
    double peso;
    float altura;

    public Persona(String nombre, int edad, char sexo, int cedula , double peso, float altura) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = cedula;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public char getSexo() 
    {
        return sexo;
    }

    public void setSexo(char sexo) 
    {
        this.sexo = sexo;
    }

    public int getCedula() 
    {
        return cedula;
    }

    public void setCedula(int cedula) 
    {
        this.cedula = cedula;
    }

    public double getPeso() 
    {
        return peso;
    }

    public void setPeso(double peso) 
    {
        this.peso = peso;
    }

    public float getAltura() 
    {
        return altura;
    }

    public void setAltura(float altura) 
    {
        this.altura = altura;
    }
}