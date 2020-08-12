package Centro_Hospitalario;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @Juan Guerrero
 */
public class Principal 
{
    public static void main(String[] args) {
        String nombrepac = null;
        String nombremed = null;
        int edadpac = 0;
        int edadmed = 0;
        int cedulapac = 0;
        int cedulamed = 0; 
        char sexopac = 0;
        char sexomed = 0;
        double pesopac = 0;
        double pesomed = 0;
        float alturapac = 0;
        float alturamed = 0;
        String especialidad = null;
        int años_experiencia = 0;
        double valor_consulta = 0;
        String nombre_medico = null;
        String fecha_consulta = null;
        
        Scanner leer = new Scanner(System.in);
        
        int opc = 0;
        
        Medico medico = new Medico( especialidad, años_experiencia, valor_consulta, nombremed, edadmed, sexomed, cedulamed, pesomed, alturamed);

        Paciente paciente = new Paciente(nombrepac, edadpac, sexopac, cedulapac, pesopac, alturapac, fecha_consulta, nombre_medico);
  do
  {
      
              opc = Integer.parseInt(JOptionPane.showInputDialog("\tMENU\n"
              + "1. Insertar Datos Medico: "
              + "\n2. Insertar Datos Paciente: "
              + "\n3. Mostrar Datos Medico: "
              + "\n4. Mostrar Datos Paciente: "
              + "\n5. Modificar Datos Medico: "
              + "\n6. Modificar Datos Paciente: "
              + "\n7. Mostrar Datos Modificados del Paciente: "
              + "\n8. Mostrar Datos Modificados del Doctor: "
              + "\n9. Indicar si el paciente es mayor de edad: "
              + "\n10. Comparar edad mayor: "
              + "\n11. Indicar IMC del paciente y su clasificacion: "
              + "\n12. Salir: "));
      switch(opc)
      {
          case 1:
              nombremed = JOptionPane.showInputDialog("Ingresar nombre del medico: ");
              medico.setNombre(nombremed);
              edadmed = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la edad del medico: "));
              medico.setEdad(edadmed);
              sexomed = JOptionPane.showInputDialog("Ingresa sexo del medico: ").charAt(0);
              medico.setSexo(sexomed);
              cedulamed = Integer.parseInt(JOptionPane.showInputDialog("Ingresar documento del medico: "));
              medico.setCedula(cedulamed);
              pesomed = Double.parseDouble(JOptionPane.showInputDialog("Ingresar peso del medico en kg: "));
              medico.setPeso(pesomed);
              alturamed = Float.parseFloat(JOptionPane.showInputDialog("Ingresar altura del medico en cms: "));
              medico.setAltura(alturamed);
              especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del medico: ");
              medico.setEspecialidad(especialidad);
              años_experiencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años de experiencia del medico: "));
              medico.setAños_experiencia(años_experiencia);
              valor_consulta = Double.parseDouble(JOptionPane.showInputDialog("Ingresar valor de la consulta: "));
              medico.setValor_consulta(valor_consulta);
              break;
          case 2:
              nombrepac = JOptionPane.showInputDialog("Ingresar el nombre del paciente: ");
              paciente.setNombre(nombrepac);
              edadpac = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la edad del paciente"));
              paciente.setEdad(edadpac);
              sexopac = JOptionPane.showInputDialog("Ingresar sexo del paciente: ").charAt(0);
              paciente.setSexo(sexopac);
              cedulapac = Integer.parseInt(JOptionPane.showInputDialog("Ingresar #documento del paciente: "));
              paciente.setCedula(cedulapac);
              pesopac = Double.parseDouble(JOptionPane.showInputDialog("Ingresar peso del paciente en kg: "));
              paciente.setPeso(pesopac);
              alturapac = Float.parseFloat(JOptionPane.showInputDialog("Ingresar altura del paciente en cm;"));
              paciente.setAltura(alturapac);
              fecha_consulta = JOptionPane.showInputDialog("Ingresar la fecha de la consulta: ");
              paciente.setFecha_consulta(fecha_consulta);
              nombre_medico = JOptionPane.showInputDialog("Ingresar el nombre del medico que atendio al paciente: ");
              paciente.setNombre_medico(nombre_medico);
              break;
          case 3:
              medico.datosMedico();
              break;
          case 4:
              paciente.datosPaciente();
              break;
          case 5:
              nombremed = JOptionPane.showInputDialog("Ingresar nombre del medico: ");
              medico.setNombre(nombremed);
              edadmed = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la edad del medico: "));
              medico.setEdad(edadmed);
              sexomed = JOptionPane.showInputDialog("Ingresa sexo del medico: ").charAt(0);
              medico.setSexo(sexomed);
              cedulamed = Integer.parseInt(JOptionPane.showInputDialog("Ingresar documento del medico: "));
              medico.setCedula(cedulamed);
              pesomed = Double.parseDouble(JOptionPane.showInputDialog("Ingresar peso del medico en kg: "));
              medico.setPeso(pesomed);
              alturamed = Float.parseFloat(JOptionPane.showInputDialog("Ingresar altura del medico en cms: "));
              medico.setAltura(alturamed);
              especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del medico: ");
              medico.setEspecialidad(especialidad);
              años_experiencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años de experiencia del medico: "));
              medico.setAños_experiencia(años_experiencia);
              valor_consulta = Double.parseDouble(JOptionPane.showInputDialog("Ingresar valor de la consulta: "));
              medico.setValor_consulta(valor_consulta);
              break;
          case 6:
              nombrepac = JOptionPane.showInputDialog("Ingresar el nombre del paciente: ");
              paciente.setNombre(nombrepac);
              edadpac = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la edad del paciente"));
              paciente.setEdad(edadpac);
              sexopac = JOptionPane.showInputDialog("").charAt(0);
              paciente.setSexo(sexopac);
              cedulapac = Integer.parseInt(JOptionPane.showInputDialog("Ingresar #documento del paciente: "));
              paciente.setCedula(cedulapac);
              pesopac = Double.parseDouble(JOptionPane.showInputDialog("Ingresar peso del paciente en kg: "));
              paciente.setPeso(pesopac);
              alturapac = Float.parseFloat(JOptionPane.showInputDialog("Ingresar altura del paciente en cm;"));
              paciente.setAltura(alturapac);
              fecha_consulta = JOptionPane.showInputDialog("Ingresar la fecha de la consulta: ");
              paciente.setFecha_consulta(fecha_consulta);
              nombre_medico = JOptionPane.showInputDialog("Ingresar el nombre del medico que atendio al paciente: ");
              paciente.setNombre_medico(nombre_medico);
              break;
          case 7:
              paciente.datosPaciente();
              break;
          case 8:
              medico.datosMedico();
              break;
          case 9:
              paciente.comprobarAdultez(edadpac);
              break;
          case 10:
              if (edadpac > edadmed)
              {
                  JOptionPane.showMessageDialog(null, "El paciente es mayor: su edad es: "+edadpac);
              }else if(edadmed > edadpac)
              {
                  JOptionPane.showMessageDialog(null, "El medico es mayor, su edad es: "+edadmed);
              }else
              {
                  JOptionPane.showMessageDialog(null, "Los dos tienen la misma edad: "+edadpac);
              }
              break;
          case 11: 
              paciente.estadoIMC();
              break;
          case 12:
              JOptionPane.showMessageDialog(null, "HASTA LA PROCKSIMA \nBy: Juan Manuel Guerrero Cañon");
              break;
      }
  }while(opc != 12);
}
}