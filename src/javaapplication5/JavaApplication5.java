/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication5 {

    public static void main(String[] args) {
        // TODO code applicahtion logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("OPCIONES 1, 2,3,4,5,6,7,8,9,10,11,12,13");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1(sc);
                break;
            case 2:
                ejercicio2(sc);
                break;
            case 3:
                ejercicio3(sc);
                break;
            case 4:
                ejercicio4(sc);
                break;
            default:
                System.out.println("opcion no valida");

        }
    }
    
    
    //Ejercicio 1
    public static void ejercicio1(Scanner sc){
     int num=0;
     int num2=0;
     System.out.println("Introduce el Primer Dato");
     num = sc.nextInt();
     System.out.println("Introduce el Segundo Dato");
     num2 = sc.nextInt();
     
     for (int i=num; i<num2; i++ ){
         System.out.println(i);
      }
    }
        //codigo ejercicio 2
    public static void ejercicio2(Scanner sc){
        int resul;
        for (int i=1; i<=20; i++) {
            resul=5*i;
            System.out.println(resul);
        }
    }
    
    public static void ejercicio3(Scanner sc){
        
        
    }
}
