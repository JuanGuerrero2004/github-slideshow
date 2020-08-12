package Centro_Hospitalario;

import javax.swing.JOptionPane;

/**
 *
 * @Juan Guerrero
 */
public class Paciente extends Persona{
    
    private String fecha_consulta;
    private String nombre_medico;
    
    public Paciente(String nombre, int edad, char sexo, int cedula, double peso, float altura, String fecha_consulta, String nombre_medico) 
    {
        super(nombre, edad, sexo, cedula, peso, altura);
        this.fecha_consulta = fecha_consulta;
        this.nombre_medico = nombre_medico;
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
    
    public void getCedula (int cedula)
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
    public String getFecha_consulta()  
    {
        return fecha_consulta;
    }

    public void setFecha_consulta(String fecha_consulta) 
    {
        this.fecha_consulta = fecha_consulta;
    }

    public String getNombre_medico() 
    {
        return nombre_medico;
    }

    public void setNombre_medico(String nombre_medico) 
    {
        this.nombre_medico = nombre_medico;
    }
    
    public void estadoIMC()
    {
        double imc = getPeso() / Math.pow((getAltura() / 100), 2);
        if (imc < 18.5)
        {
            JOptionPane.showMessageDialog(null, "Peso insufiente: " + imc);
        }
                if (imc >= 18.5 && imc <= 24.9)
                    {
                        JOptionPane.showMessageDialog(null, "Peso normal: " + imc);
                    }
                            if (imc >= 25 && imc <= 26.9)
                            {
                                JOptionPane.showMessageDialog(null, "Sobrepeso grado I: " + imc);
                            }
                                    if (imc >= 27 && imc <= 29.9)
                                    {
                                        JOptionPane.showMessageDialog(null, "Sobrepeso grado II (preobesidad): " + imc);
                                    }
                                            if (imc >= 30 && imc <= 34.9)
                                            {
                                                JOptionPane.showMessageDialog(null, "Obesidad tipo I: " + imc);
                                            }
                                                    if (imc >= 35 && imc <= 39.9)
                                                     {
                                                        JOptionPane.showMessageDialog(null, "Obesidad tipo II: " + imc);
                                                     }
                                                            if (imc >= 40 && imc <= 49.9)
                                                            {
                                                                JOptionPane.showMessageDialog(null, "Obesidad tipo III (mórbida): " + imc);
                                                            }
                                                                    if (imc > 50)
                                                                    {
                                                                        JOptionPane.showMessageDialog(null, "Obesidad tipo IV (extrema): " + imc);
                                                                    }  
    }
    
    public void comprobarAdultez(int edadpac)
    {
        if(edadpac >= 18)
        {
            JOptionPane.showMessageDialog(null, "El paciente es mayor de edad: " + edadpac + " años");
        }else if(edadpac <18)
        {
            JOptionPane.showMessageDialog(null, "El paciente es menor de edad: " + edadpac + " años");
        }
    }
    
    public void datosPaciente()
    {
                JOptionPane.showMessageDialog(null, "Su nombre es: "+getNombre()
                + "\nSu edad es: " + getEdad()
                + "\nSu cedula es: " + getCedula()
                + "\nSu sexo es: " + getSexo()
                + "\nSu peso en kg es: " + getPeso()
                + "\nSu altura en cms es" + getAltura()
                + "\nLa fecha de consulta es: " + getFecha_consulta()
                + "\nEl medico lo atendio es: " + getNombre_medico());
    }
}