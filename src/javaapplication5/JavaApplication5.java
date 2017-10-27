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
                   ejercicio5(sc);
             ejercicio4(sc);
                break;
            case 5:
                ejercicio5(sc);
                break;
            case 6:
                ejercicio6(sc);
                break;
            case 7:
                ejercicio7(sc);
                break;
            case 8:
                ejercicio8(sc);
                break;
            case 9:
                ejercicio9(sc);
                break;
            case 10:
                ejercicio10(sc);
                break;
            case 11:
                ejercicio11(sc);
                break;
            case 12:
                ejercicio12(sc);
                break;
            case 13:
                ejercicio13(sc);
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
    //codigo ejercicio 3
    public static void ejercicio3(Scanner sc){
       System.out.println("Introduce numero 1");
            int num1 = sc.nextInt();
    System.out.println("Introduce numero 2");
            int num2 = sc.nextInt();
    System.out.println("Introduce numero 3");
            int num3 = sc.nextInt();
    System.out.println("Introduce numero 4");         
            int num4 = sc.nextInt();
    System.out.println("Introduce numero 5");        
            int num5 = sc.nextInt();
    System.out.println("Introduce numero 6");
            int num6 = sc.nextInt();
    System.out.println("Introduce numero 7");
            int num7 = sc.nextInt();
    System.out.println("Introduce numero 8");
            int num8 = sc.nextInt();        
    System.out.println("Introduce numero 9");
            int num9 = sc.nextInt();
    System.out.println("Introduce numero 10");
            int num10 = sc.nextInt();   
    System.out.println("Introduce numero 11");
            int num11 = sc.nextInt();        
    System.out.println("Introduce numero 12");
            int num12 = sc.nextInt();        
    System.out.println("Introduce numero 13");
            int num13 = sc.nextInt();
    System.out.println("Introduce numero 14");
            int num14 = sc.nextInt(); 
    System.out.println("Introduce numero 15");
            int num15 = sc.nextInt();        
    double suma = num1+num2+num3+num4+num5+num6+num6+num7+num8+num9+num10+num11+num12+num13+num14+num15;
    double media = suma /15;
    System.out.println ("La media es"+media);
    }  
    //codigo ejercicio 4
    private static void ejercicio4(Scanner sc) {
      System.out.println ("Introduce valores");
    int numval = sc.nextInt();
    int contador = 0;
    int sumatorio = 0;
    do {
        contador ++;
        System.out.println("Introduce un numero");
        int nuevonum = sc.nextInt();
        sumatorio = sumatorio + nuevonum;
    }while (contador != numval);
    int media= (sumatorio/numval);
    System.out.println("La media es " +media);     
    }
    //codigo ejercicio 5
    private static void ejercicio5(Scanner sc) {
        int num,hor,min,seg;
        System.out.println("ingrese las horas ");
        int num1 = sc.nextInt();
                System.out.println("ingrese los minutos ");
        int num2 = sc.nextInt();
        System.out.println("ingrese los segundos ");
        int num3 = sc.nextInt();
        hor=num1*3600;
        min=num2*60;
        seg=num3;
        int total;
        total = seg + min + hor;
        System.out.println(total + "s");  
    }

    public static void ejercicio6(Scanner sc) {
        
        int num,hor,min,seg;
        System.out.println("ingrese los segundos ");
        num=sc.nextInt();
        hor=num/3600;
        min=(num-(3600*hor))/60;
        seg=num-((hor*3600)+(min*60));
        System.out.println(hor+"h "+min+"m "+seg+"s");
    }

    public static void ejercicio7(Scanner sc){
    int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
    int max=10;
    
    System.out.println("Introduce el primer numero");
    n1 = sc.nextInt();
    System.out.println("Introduce el segundo numero");
    n2 = sc.nextInt();
    System.out.println("Introduce el tercer numero");
    n3 = sc.nextInt();
    System.out.println("Introduce el cuarto numero");
    n4 = sc.nextInt();
    System.out.println("Introduce el quinto numero");
    n5 = sc.nextInt();
    System.out.println("Introduce el sexto numero");
    n6 = sc.nextInt();
    System.out.println("Introduce el septimo numero");
    n7 = sc.nextInt();
    System.out.println("Introduce el octavo numero");
    n8 = sc.nextInt();
    System.out.println("Introduce el noveno numero");
    n9 = sc.nextInt();
    System.out.println("Introduce el decimo numero");
    n10 = sc.nextInt();
    
    int mayor=0;
    
    
    }
    
    public static void ejercicio8(Scanner sc){
    }

    public static void ejercicio9(Scanner sc){
    int a,b,c,Mayor,Medio,Menor;

        System.out.println("Introduce el primer numero");
        a=sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b=sc.nextInt();
        System.out.println("Introduce el tercer numero");
        c=sc.nextInt();

        if(a>b&&a>c)
            Mayor=a;
        else
            if(b>a&&b>c)
            Mayor=b;
        else
            Mayor=c;

        if(a<b&&a<c)
        Menor=a;
        else
        if(b<a&&b<c)
        Menor=b;
        else
        Menor=c;
        Medio=(a+b+c)-(Mayor+Menor);
        System.out.println("el de los numeros ingresados es: ");
        System.out.println(Mayor+" "+Medio+" "+Menor);
        }
    
    public static void ejercicio10(Scanner sc){
    
    }
    
    public static void ejercicio11(Scanner sc){
        int nota=0;
        System.out.println("Introduce la nota");
        nota=sc.nextInt();
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso"); 
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6: 
                System.out.println("Bien"); 
                break;
            case 7:
            case 8: 
                System.out.println("Notable"); 
                break;
            case 9:
            case 10: 
                System.out.println("Sobresaliente"); 
                break;
            default: System.out.println("Error al introducir la nota");
        }   
    }
    
    public static void ejercicio12(Scanner sc){
        int alumnos;
        double nota = 0;
        double aprobados = 0;
        double suspensos = 0;
        double media;
        double suma = 0;
    
    System.out.println("Introduce el numero de alumnos");
    alumnos = sc.nextInt();
    
    for (int i=0; i<alumnos; i++){
        System.out.println("Introduce la nota: ");
        nota = sc.nextInt();
        suma = suma + nota;
        if (nota < 5){
          suspensos++;
        } else {
            aprobados++;
        }
        
    }
    media = suma / alumnos;
    System.out.println("La media de las notas es: " + media);
    System.out.println("El numero de aprobados es: " + aprobados);
    System.out.println("El numero de suspensos es: " + suspensos);
}   
      
    public static void ejercicio13(Scanner sc){
     int a=0,i,n;
         System.out.println("Introduce un numero");
         n=sc.nextInt();
         for(i=1;i<(n+1);i++){
         if(n%i==0){
             a++;
            }
         }
         if(a!=2){
              System.out.println("No es Primo");
            }else{
                System.out.println("Si es Primo");
         }
     }
 
    }
