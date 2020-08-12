package Centro_Hospitalario;

import javax.swing.JOptionPane;

/**
 *
 * @Juan Guerrero
 */
public class Medico extends Persona{

    private String especialidad;
    private int años_experiencia;
    private double valor_consulta;

    public Medico(String especialidad, int años_experiencia, double valor_consulta, String nombre, int edad, char sexo, int cedula, double peso, float altura) {
        super(nombre, edad, sexo, cedula, peso, altura);
        this.especialidad = especialidad;
        this.años_experiencia = años_experiencia;
        this.valor_consulta = valor_consulta;
    }

    public String setNombre()
    {
        return nombre;
    }
    
    public void getNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public int setEdad()
    {
        return edad;
    }
    
    public void getEdad(int edad)
    {
        this.edad = edad;
    }
    
    public char setSexo()
    {
        return sexo;
    }
    
    public void getSexo(char sexo)
    {
        this.sexo = sexo;
    }
    
    public int setCedula()
    {
        return cedula;
    }
    
    public void getCedula(int cedula)
    {
        this.cedula = cedula;
    }
    
    public double setPeso()
    {
        return peso;
    }
    
    public void getPeso(double peso)
    {
        this.peso = peso;
    }
    
    public float setAltura()
    {
        return altura;
    }
    
    public void getAltura(float altura)
    {
        this.altura = altura;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }

    public void setAños_experiencia(int años_experiencia) {
        this.años_experiencia = años_experiencia;
    }

    public double getValor_consulta() {
        return valor_consulta;
    }

    public void setValor_consulta(double valor_consulta) {
        this.valor_consulta = valor_consulta;
    }
    
    public void datosMedico()
    {
        JOptionPane.showMessageDialog(null, "Su nombre es: "+getNombre()
                + "\nSu edad es: " + getEdad()
                + "\nSu cedula es: " + getCedula()
                + "\nSu sexo es: " + getSexo()
                + "\nSu peso es: " + getPeso()
                + "\nSu altura es: " + getAltura()
                + "\nSu especialidad es: " + getEspecialidad()
                + "\nSus años de experiencia son: " + getAños_experiencia()
                + "\nEl valor de su consulta es: " + getValor_consulta());
    }
}
