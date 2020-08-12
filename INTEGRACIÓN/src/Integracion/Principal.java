package Integracion;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @Juan Guerrero
 */
public class Principal {
    static ArrayList<Figuras_Geometricas> Figuras_Geometricas = new ArrayList<Figuras_Geometricas>();
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) 
    {
      llenarFiguras_Geometricas(); 
      
      ////////////MOSTRAR LOS DATOS EL AREA Y EL PERIMETRO DE CADA FIGURA//////////
      mostrarFiguras_Geometricas();
        int opc;
        String hola;
        System.out.print("Hola soy Juan Guerrero, saludame: ");
        hola = leer.nextLine();
        
        do
             {
                 System.out.print("\nSELECCIONE UNA OPCION EN LA CALCULADORA DE INTEGRACION ARITMETICA \n1. Llenar Figuras Geometricas Deseadas mediante el teclado \n2. Mostrar Figuras Geometricas llenadas anteriormente mediante el teclado \n3. Modificar Figuras Geometricas mostradas anteriormente mediante el teclado \n4. Mostrar Figuras Geometricas modificadas \n5. Salir del programa \n ");   
                 opc = leer.nextInt();
            switch(opc)
            {
                case 1:
                    llenarFiguras_Geometricas();
                    break;
                case 2:
                    mostrarFiguras_Geometricas();
                    break;
                case 3:
                    llenarFiguras_Geometricas();
                    break;
                case 4:
                    mostrarFiguras_Geometricas();
                    break;
                case 5:
                    
                    System.out.println("HASTA LA PROCKSIMA \nBy: Juan Manuel Guerrero Cañon");
                    break;
            }
        }while(opc != 5);
    }  
    public static void llenarFiguras_Geometricas()
    {
        int opc;
        char respuesta;
        do
        {
           do
           {
            System.out.println("\tDigite que Figura Geometrica desea: ");
            System.out.print("\n1. Rectangulo"
                    + "\n2. Triangulo"
                    + "\n3. Circulo"
                    + "\n4. Cometa"
                    + "\n5. Cuadrado"
                    + "\n6. Paralelogramo"
                    + "\n7. Rombo"
                    + "\n8. Trapecio"
                    + "\nOpcion: ");
            opc = leer.nextInt();
           }while(opc<1 || opc>8);
           switch (opc)
           {
               case 1://////////Llenar un triangulo
                   llenarRectangulo();
                   break;
               case 2://///////Llenar un Rectangulo
                   llenarTriangulo();
                   break;
               case 3:////////Llenar un circulo
                   llenarCirculo();
                   break;
               case 4://///////Llenar un cometa
                   llenarCometa();
                   break;
               case 5://///////Llenar un cuadrado
                   llenarCuadrado();
                   break;
               case 6:////////Llenar un paralelogramo
                   llenarParalelogramo();
                   break;
               case 7://///////Llenar un Rombo
                   llenarRombo();
                   break;
               case 8://///////Llenar un trapecio
                   llenarTrapecio();
                   break;
           }
            System.out.println("\nDesea introducir otra figura geometrica (s/n): ");
            respuesta = leer.next().charAt(0);
            System.out.println("");
        }while(respuesta == 's' || respuesta == 'S');
    }
    
    public static void llenarTriangulo()
    {
        double lado1, lado2, lado3;
        
        System.out.print("\nDigite lado1 del triangulo: ");
        lado1 = leer.nextDouble();
        System.out.print("Digite lado2 del triangulo: ");
        lado2 = leer.nextDouble();
        System.out.print("Digite lado3 del triangulo: ");
        lado3 = leer.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        
        Figuras_Geometricas.add(triangulo);////7Guardamos un triangulo dentro del arreglo de Figuras_Geometricas
        
    }
    
    public static void llenarRectangulo()
    {
       double lado1, lado2;
       
        System.out.print("\nDigite el lado1 del rectangulo: ");
        lado1 = leer.nextDouble();
        System.out.print("Digite el lado2 del rectangulo: ");
        lado2 = leer.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        Figuras_Geometricas.add(rectangulo);////Guardamos un rectangulo dentro del arreglo de Figuras_Geometricas
    }
    
    public static void llenarCuadrado()
    {
       double lado1;
       
        System.out.print("Digite el lado1 del cuadrado: ");
        lado1 = leer.nextDouble();
        
        Cuadrado cuadrado = new Cuadrado(lado1);
        
        Figuras_Geometricas.add(cuadrado);////Guardamos un cuadrado dentro del arreglo Figuras_Geometricas
    }
    
    public static void llenarCirculo()
    {
        double radio;
        
        System.out.print("Digite el valor del radio: ");
        radio = leer.nextDouble();
        
        Circulo circulo = new Circulo(radio);
        
        Figuras_Geometricas.add(circulo);/////Guardamos un cuadrado dentro del arreglo Figuras_Geometricas
    }
    
    public static void llenarCometa()
    {
        double diag1;
        double diag2;
        
        System.out.print("Digite el valor de la diagunal1: ");
        diag1 = leer.nextDouble();
        System.out.print("Digite el valor de la diagonal2: ");
        diag2 = leer.nextDouble();
        
        Cometa cometa = new Cometa(diag1,diag2);
        
        Figuras_Geometricas.add(cometa);
    }
    
    public static void llenarParalelogramo()
    {
        double a;
        double b;
        double h;
        
        System.out.print("Ingresar el valor de la altura: ");
        h = leer.nextDouble();
        System.out.print("Ingresar el valor de la base: ");
        b = leer.nextDouble();
        System.out.print("Ingresar el valor del lado: ");
        a = leer.nextDouble();
        
        Paralelogramo paralelogramo = new Paralelogramo(a, b, h);
        
        Figuras_Geometricas.add(paralelogramo);
    }
    
    public static void llenarRombo()
    {
        double diag1;
        double diag2;
        
        System.out.print("Ingresar el valor de la diagonal1: ");
        diag1 = leer.nextDouble();
        System.out.print("Ingresar el valor de la diagonal2: ");
        diag2 = leer.nextDouble();
        
        Rombo rombo = new Rombo(diag1, diag2);
        
        Figuras_Geometricas.add(rombo);
    }
    
    public static void llenarTrapecio()
    {
        double bassup;
        double basinf;
        double lat1;
        double h;
        
        System.out.println("Ingresar el valor de la base superior: ");
        bassup = leer.nextDouble();
        System.out.println("Ingresar el valor de la base inferior: ");
        basinf = leer.nextDouble();
        System.out.println("Ingresar el valor del lateral1: ");
        lat1 = leer.nextDouble();
        System.out.println("Ingresar el valor de la altura: ");
        h = leer.nextDouble();
        
        Trapecio trapecio = new Trapecio(bassup, basinf, lat1, h);
        
        Figuras_Geometricas.add(trapecio);
    }
    
    public static void mostrarFiguras_Geometricas()
    {
      ///////RECORRIENDO EL ARREGLO DINAMICO//////////////////
        for(Figuras_Geometricas figugeo : Figuras_Geometricas)
        {
            System.out.println(" ");
            System.out.println(figugeo.toString());
            System.out.println("Area=  "+figugeo.area());
            System.out.println("Perimetro= "+figugeo.perimetro());
            System.out.println(" ");
        }
    }
}