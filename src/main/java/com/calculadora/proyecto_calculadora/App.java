package com.calculadora.proyecto_calculadora;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENSAJE DE PRUEBA PARA VERIFICAR CONEXION CON GITHUB");

        int opcion;
        do {
            System.out.println("Seleccione una operacion:");
            System.out.println("1. Calcular area de un circulo");
            System.out.println("2. Calcular area de un cuadrado");
            System.out.println("3. Calcular area de un rectangulo");
            System.out.println("4. Calcular area de un triangulo");
            System.out.println("0. Salir\n");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del circulo: ");
                    double radio = scanner.nextDouble();
                    double areaCirculo = calcularAreaCirculo(radio);
                    System.out.println("\nEl area del circulo es: " + areaCirculo);
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double ladoCuadrado = scanner.nextDouble();
                    double areaCuadrado = calcularAreaCuadrado(ladoCuadrado);
                    System.out.println("\\nEl area del cuadrado es: " + areaCuadrado);
                    break;
                case 3:
                    System.out.print("Ingrese la base del rectangulo: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    double areaRectangulo = calcularAreaRectangulo(baseRectangulo, alturaRectangulo);
                    System.out.println("\\nEl area del rectangulo es: " + areaRectangulo);
                    break;
                case 4:
                    System.out.print("Ingrese la base del triangulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triangulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                    System.out.println("\\nEl area del triangulo es: " + areaTriangulo);
                    break;
                case 0:
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}