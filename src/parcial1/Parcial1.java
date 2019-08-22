package parcial1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Parcial1 {

    public static void main(String[] args) {
       Scanner dato = new Scanner(System.in);
        int car1,nota1,nota2,nota3,nota4,promedio;
        int aux=0;
           System.out.println("-----------------Ingrese No. Carné------------");
           System.out.println();
           car1=Integer.parseInt(JOptionPane.showInputDialog("Su Numero De Carné: "));   
           System.out.print("----------------Ingrese Notas-------------");
           System.out.println();
           nota1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Primer Nota: ")); 
           nota2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Segunda Nota: "));
           nota3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Tercer Nota: "));
           nota4=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cuarta Nota: "));
           
     if (nota1 < nota2) {
        aux = nota2;
        nota2 = nota1;
        nota1 = aux;
    }
 
    if (nota1 < nota3) {
        aux = nota3;
        nota3 = nota1;
        nota1 = aux;
    }
    if(nota1 < nota4){
        aux = nota4;
        nota4=nota1;
        nota1=aux;
    }
 
    if (nota2 < nota3) {
        aux = nota3;
        nota3 = nota2;
        nota2 = aux;
    }
    if (nota2 < nota4){
        aux=nota4;
        nota4=nota2;
        nota2=aux;
    }
    if(nota3 < nota4){
        aux=nota4;
        nota4=nota3;
        nota3=aux;
    } promedio=(nota1+nota2+nota3+nota4)/4;
   
    System.out.println();
    System.out.println("------------RESULTADOS----------------------");
    System.out.print("Su Carné: "+car1);System.out.println();
    System.out.println("Notas: "+nota1+" "+nota2+" "+nota3+" "+nota4);  
    System.out.println("El Promedio de sus notas es: "+promedio);
    System.out.println();
    }   
}
