import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cual es tu nombre: ");
        System.out.println("Hola " + sc.nextLine() + ". Este programa esta hecho en el lenguaje de programacion: Java");
        
        sc.close();
    }
}
