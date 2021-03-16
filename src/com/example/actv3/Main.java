package com.example.actv3;


public class Main {
    public static String nombre="lauro";
    public static int [] calificaciones = new int [] {75,90,97,87,85};
    public static void main(String[] args) {
        System.out.println(".............     Actividad 6      ............");
        imprimir(nombre,calificacion(promedio(calificaciones)),promedio(calificaciones),calificaciones);

    }

    public static int promedio (int a []){
        int suma=0;
        for (int i=0;i<a.length;i++){
            suma +=a[i];
        }
        return suma/a.length;
    }

    public static char calificacion(int c){
        char calf='A';

        if (c<=50){
            calf='F';
        }else if(c>=51 && c<=60){
            calf='E';
        }else if(c>=61 && c<=70){
            calf='D';
        }
        else if(c>=71 && c<=80){
            calf='C';
        }
        else if(c>=81 && c<=90){
            calf='B';
        }
        else if(c>=91){
            calf='A';
        }
        return calf;
    }

    public static  void imprimir(String name ,char calificacion,int promedio,int cal []){
        System.out.println("Nombre del estudiante: "+name);

        for (int i =0;i <cal.length;i++){
            System.out.println("Materia numero:["+i+"] con Calificación de: ["+cal[i]+"]");
        }

        System.out.println("Promedio ["+promedio+"]");
        System.out.println("Calificación ["+calificacion+"]");
    }
}   