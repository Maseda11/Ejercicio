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
        System.out.println("OPCIONES 1, 2,3,4");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1(sc);
                break;
            case 2:
                ejercicio2();
                break;
            default:
                System.out.println("opcion no valida");

        }
    }
    
    
    
    public static void ejercicio1(Scanner sc){
     int num=0;
     int num2=0;
     System.out.println("Introduce el Primer Dato");
     num = sc.nextInt();
     System.out.println("Introduce el Segundo Dato");
     num2 = sc.nextInt();
     
     for (int i=0; i=10; i=0 );
     
      //codigo ejercicio 1
    }

    public static void ejercicio2(){
        //codigo ejercicio 2
    }
    
}
