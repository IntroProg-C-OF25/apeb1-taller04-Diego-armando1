import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        double costoCpu, costoTe, costoPa, costoRa, costoT;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese el costo del cpu: ");
        costoCpu = teclado.nextDouble();
        System.out.print("ingrese el costo del teclado: ");
        costoTe = teclado.nextDouble();
        System.out.print("ingrese el costo del la pantalla: ");
        costoPa = teclado.nextDouble();
        System.out.print("ingrese el costo del raton: ");
        costoRa = teclado.nextDouble();
        costoT = costoCpu + costoTe + costoPa + costoRa;
        System.out.println("costo total es = " + costoT);
        
    }
    
}
