package FES.ICO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main() {

        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        Scanner teclado = new Scanner(System.in);

        try {

            System.out.println("Ingrese su peso: ");
            calculadoraIMC.setPeso(teclado.nextDouble());
            System.out.println("Ingrese su altura: ");
            calculadoraIMC.setAltura(teclado.nextDouble());
            calculadoraIMC.calcularIMC();
            Integer numero = new Integer(10);
            numero = null;
            System.out.println(numero.byteValue());

        } catch (InputMismatchException e) {
            System.out.println("Error revisa tu entrada");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Objeto nulo Revisa tu entrada");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido");
            System.out.println(e.getMessage());
        }
        System.out.println("Su IMC es: " + calculadoraIMC.getImc());


        try {
            Integer numero = new Integer(10);
            numero = null;
            System.out.println(numero.byteValue());
        } catch (NullPointerException e) {
            System.out.println("El valor es nulo ");
        }


    }
}