import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        double costoPorKilovatio, kilovaConsu, edad, totalCance, totalDes = 0; 
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese el costo del kilovatio por hora: ");
        costoPorKilovatio = teclado.nextDouble();
        System.out.print("ingrese los kilovatios consumidos al mes: ");
        kilovaConsu = teclado.nextDouble();
        System.out.print("ingrese su edad: ");
        edad = teclado.nextDouble();
        totalCance = costoPorKilovatio * kilovaConsu;
        if (edad > 65)
        totalDes = totalCance * 0.9;
          else
            totalCance = totalDes; 
        System.out.println("el valor de la planilla es  = " + totalCance );
        System.out.println("el valor de la planilla con descuento es  = " + totalDes);
            
    }
    
}
