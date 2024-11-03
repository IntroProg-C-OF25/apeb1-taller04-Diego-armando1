import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        double numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numero: ");
        numero = teclado.nextDouble();
          if (numero >= 2 && numero <= 6) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("El número ingresado no está en el rango permitido (2-6).");
        }
    }
    
}
