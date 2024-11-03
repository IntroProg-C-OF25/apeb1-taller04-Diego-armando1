import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        double precioNet, precioYoutubePre, precioDropbox, precioSpotify, costoSinDes, edad, costoConDes = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese el costo de netflix mensual: ");
        precioNet = teclado.nextDouble();
        System.out.print("ingrese el costo de youtube premiun mensual: ");
        precioYoutubePre = teclado.nextDouble();
        System.out.print("ingrese el costo de dropbos mensual: ");
        precioDropbox = teclado.nextDouble();
        System.out.print("ingrese el costo de spotify mensual: ");
        precioSpotify = teclado.nextDouble();
        costoSinDes = precioNet + precioYoutubePre + precioDropbox + precioSpotify;
        System.out.print("ingrese su edad: ");
        edad = teclado.nextDouble();
        if (edad < 30)
        costoConDes = costoSinDes * 0.8;
        else
            costoConDes = costoSinDes;
        System.out.println("el valor sin descuento es  = " + costoSinDes );
        System.out.println("el valor con descuento es = " + costoConDes);
                  
    }
    
}
