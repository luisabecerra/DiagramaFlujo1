/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramaflujo1;

/**
 *
 * @author Luisa Paola Becerra Pleáez--Juan Camilo Mora Tinoco	
 */
public class DiagramaFlujo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner lectura=
                new java.util.Scanner(System.in);
        int a,b,c;
        int mayor=0;
        System.out.println ("Ingrese A");
        a= lectura.nextInt();
        System.out.println ("Ingrese B");
        b= lectura.nextInt();
        System.out.println ("Ingrese C");
        c= lectura.nextInt();
        if (a>b){
            if (a>c){
                mayor=a;
            }
            else {
               mayor=c;
            }
            }
        else{
            if(b>c){
                mayor=b;
                }
                else{
            mayor=c;
            }
        }
    System.out.println("El mayor es " + mayor);
    }      
}
            
        
       
    
    

