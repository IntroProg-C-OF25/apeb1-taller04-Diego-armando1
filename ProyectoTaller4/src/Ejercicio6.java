import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        double montoPres, interesMen, numeroPagos, pagoMensual;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese el monto del prestamo: ");
        montoPres = teclado.nextDouble();
        System.out.print("ingrese el interes mensual: ");
        interesMen = teclado.nextDouble() / 100;
        numeroPagos = 12;
        pagoMensual= (montoPres * interesMen) / (1 - Math.pow(1 + interesMen, -numeroPagos));
        System.out.println("el pago mensual es = " + pagoMensual);
            
    }
    
    
}
