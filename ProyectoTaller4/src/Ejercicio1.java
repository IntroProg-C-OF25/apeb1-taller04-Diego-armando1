import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        // Declaracion de datos de entrada
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        //INGRESO DE DATOS DE ENTRADA
        System.out.print("DAME LA BASE: "); // Carpinteria de salida
        base = teclado.nextDouble(); // Datos de entrada
        System.out.print("DAME LA ALTURA: ");
        altura = teclado.nextDouble();
        // PROCESAMIENTO DE DATOS DE ENTRADA
        area = (base * altura) / 2;
        // PRESENTACION DE DATOS DE SALIDA
        System.out.println("area de triangulo es = " + area);
        
               
     
    }
}
