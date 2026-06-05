package DemoInterface;

import java.util.Scanner;

public class MainDemoUno {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2.0f, 10.0f, 10.0f);
        Cuadrado cuad = new Cuadrado(2.0f, 10.f, 10.f, 10.f);
        System.out.println("Area del circulo:" + c1.calcularArea());
        System.out.println("Area del circulo:" + cuad.calcularArea());

        // escenario de decidir que figura crear
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecciona un valor entre 1 y 4");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                Circulo cx = new Circulo();
                System.out.println(cx);
                break;
            case 2:
                System.out.println("Crear un cuadrado");
                break;
            case 4:
                System.out.println("Crear un hexagono");
                break;
            case 3:
                System.out.println("Crear un triangulo");
                break;
            default:
        }
    }
}
