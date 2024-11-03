import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        double costoMinuto, cantidadMinutos, valorPlanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.print("dame costo por minuto: ");
        costoMinuto = teclado.nextDouble();
        System.out.print("dame la cantidad de minutos: ");
        cantidadMinutos = teclado.nextDouble();
        valorPlanilla = costoMinuto * cantidadMinutos;
        System.out.println("valor de la planilla es: = " + valorPlanilla);
                
    }
    
}
