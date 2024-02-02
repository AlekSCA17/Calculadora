
package tarea1;

import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class Tarea1 {
static Scanner entrada= new Scanner (System.in);
  
    public static void main(String[] args) {
         
        int opcion=0;
        
        do{
            System.out.println("--Bienvenido ☺ -- ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Tablas de multiplicar");
        System.out.println("6. Salir");
        System.out.println("Por favor digite la opcion:");
        
            opcion=entrada.nextInt();
        
        switch(opcion){
            case 1: 
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                 multiplicacion();
               break;
            case 4:
                division();
                break;
            
            case 5:
            tablademultiplicar();
               break;
            case 6:
               break;
          
                
        }
         } while(opcion != 6);
        System.out.println("Hasta pronto ☻♥ ");
        System.out.println("Autor: Brayan Alexander Guzman Margos");
        System.out.println("carnet:202105658");
                
    }
     
    static void suma(){
        System.out.println("SUMA");
        System.out.println("Digite el sumando 1");
        double numero1=entrada.nextDouble();
        System.out.println("Digite el sumando 2");
        double numero2=entrada.nextDouble();
        double resultado=numero1+numero2;
        System.out.println("El resultado es:"+resultado);
        
         }
    static void resta(){
        System.out.println("RESTA");
        System.out.println("Digite el minuendo");
        double numero1=entrada.nextDouble();
        System.out.println("Digite el sustraendo");
        double numero2=entrada.nextDouble();
        double resultado=numero1-numero2;
        System.out.println("El resultado es:"+resultado);
    }
       static void multiplicacion(){
        System.out.println("MULTIPLICACION");
        System.out.println("Digite el primer digito");
        double numero1=entrada.nextDouble();
        System.out.println("Digite el segundo digito");
        double numero2=entrada.nextDouble();
        double resultado=numero1*numero2;
        System.out.println("El resultado es:"+resultado);
    }     
       
       
       static void division(){
        System.out.println("DIVISION");
        System.out.println("Digite el dividendo");
        int numero1=entrada.nextInt();
        System.out.println("Digite el divisor");
        int numero2=entrada.nextInt();
        if (numero2== 0) {
            System.out.println("No se puede divir entre 0 ☻ ");
        }
        else {
            System.out.println("Cociente:"+numero1/numero2);
        System.out.println("Residuo:"+numero1%numero2);
       
        
        
}
       
       }

       static void tablademultiplicar(){
        System.out.println("Ingrese el numero que desea visualizar de la tabla");
        double tabla=entrada.nextDouble();
        do{
        System.out.println("Ingrese el valor con el que inicie la tabla");
        double numero1=entrada.nextDouble();
        System.out.println("Ingrese el valor con el que finalice la tabla");
        double numero2=entrada.nextDouble(); 
        
        if (numero1>numero2){
            System.out.println("Rango Incorrecto");
        } 
        else {
            do{
                System.out.println(tabla+" x "+numero1 + "=" + (tabla*numero1));
                numero1=numero1+1;
            } 
            while(numero1<=numero2);
            break;
        }
        }
        
        while(true);
        
         }






}


                
              
                
                
                
                
                
                
                
                
            
        
       
       
        
        
       
             
           
            
