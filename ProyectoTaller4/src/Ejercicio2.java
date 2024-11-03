import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        double hijo1, hijo2 ,hijo3, gastoT;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese los gatos del primer hijo");
        hijo1 = teclado.nextDouble();
        System.out.print("ingrese los gastos del segundo hijo");
        hijo2 = teclado.nextDouble();
        System.out.print("ingrese los gastos del tercer hijo");
        hijo3 = teclado.nextDouble();
        gastoT = hijo1 + hijo2 + hijo3;
        System.out.println("gasto total = " + gastoT);
        
    }
    
}
