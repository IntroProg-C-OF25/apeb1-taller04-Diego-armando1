import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        double ladoCua, alturaTri, areaCua, areaRec, areaTri, areaT;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese el valor de lado del cuadrado: ");
        ladoCua = teclado.nextDouble();
        System.out.print("ingrese el valor de la altura del triangulo: ");
        alturaTri = teclado.nextDouble();
        areaCua = ladoCua * ladoCua;
        areaRec = alturaTri * ladoCua;
        areaTri = ((ladoCua * alturaTri) / 2) * 3;
        areaT = areaCua + areaRec + areaTri;
        System.out.println("el area total del poligono es = " + areaT);
    }
    
}
