
package javaapplication118;

import java.util.Scanner;


public class JavaApplication118 {
static Scanner entrada = new Scanner(System.in);
static int opcion =0;
    public static void menu(){
        
        do{
        System.out.println("**Bienvenido al contador de letras**/n");
        System.out.println("--OPCIONES--");
        System.out.println("1.-Contar letras");
        System.out.println("2.- salir");
        
        opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:
                contador();
                break;
            case 2:
                System.out.println("Estas saliendo del sistema");
                break;
                
            default : System.out.println("Opcion equivocada");
        }
        }while(opcion!=2);
    }
    
    public static void contador(){
        
        String cadena;
        char[]Arraycadena;
        char caracter;
        int contador=0;
        
        System.out.println("Digite la palabra a contar");
        cadena = entrada.next();
        cadena = cadena.toLowerCase();
        Arraycadena = cadena.toCharArray();
        
        
        for (int i =0; i<Arraycadena.length;i++){
            caracter = Arraycadena[i];
            
            for (int j= 0;j<Arraycadena.length;j++){
                if (Arraycadena[j]== caracter){
                    contador++;
                }
            }
            System.out.println(Arraycadena[i]+" "+contador);
            contador=0;
        }
    }
    
    
    public static void main(String[] args) {
        menu();
    }
    
}
