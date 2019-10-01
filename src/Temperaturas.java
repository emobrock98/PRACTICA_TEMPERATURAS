import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        ArrayList<Double> temperaturas = new ArrayList<Double>() ;
        double temp = 0;
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("***************************");
            System.out.println("---  MENÚ TEMPERATURAS  ---");
            System.out.println("***************************");
            System.out.println("INTROCUCE LA OPCION DESEADA");
            System.out.println("1. Introducir temperaturas");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Ordenar temperaturas");
            System.out.println("4. Mostrar extremos");
            System.out.println("5. Mostrar media");
            System.out.println("6. Salir");
            System.out.println("***************************");
            System.out.println("INTRODUCE LA OPCION DESEADA");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("INTRODUCIR TEMPERATURAS");
                    System.out.println("=======================");
                    System.out.println("Introduce una temperatura: ");
                    temp = sc.nextDouble();
                    sc.nextLine();
                    temperaturas.add(temp);
                    break;

                case 2:
                    System.out.println("MOSTRANDO TEMPERATURAS...");
                    System.out.println("=========================");
                    if (!temperaturas.isEmpty()) {
                        int contador = 1;
                        for (double item : temperaturas) {
                            System.out.printf("- %d: %f ºC\n",contador, item);
                            contador++;
                        }
                    }
                    break;

                case 3:
                    System.out.println("ORDENANDO TEMPERATURAS...");
                    System.out.println("=========================");
                    Collections.sort(temperaturas);
                    int contador = 1;
                    for (double item : temperaturas) {
                        System.out.printf("- %d: %f ºC \n",contador, item);
                        contador++;
                    }
                    break;

                case 4:
                   /* System.out.println("MOSTRANDO EXTREMOS...");
                    System.out.println("=====================");
                    System.out.printf("Los extremos son : %5.2f y %-5.2f\n", temperaturas.get(0), temperaturas.get(temperaturas.size()-1)); */
                    double max;
                    System.out.println("Temperatura mayor:");
                    max = Collections.max(temperaturas);
                    System.out.println(max+"ºC");
                    double min;
                    System.out.println("Temperatura menor:");
                    min = Collections.min(temperaturas);
                    System.out.println(min+"ºC");
                    break;

                case 5:
                    double media = 0;
                    double suma = 0;
                    System.out.println("MOSTRANDO MEDIA...");
                    System.out.println("==================");
                    for(int i = 0; i < temperaturas.size(); i++)
                        suma += temperaturas.get(i);
                    media = suma/temperaturas.size();
                    System.out.printf("La media de las temperaturas es: %5.2f ºC\n",media);
                    break;

                case 6:
                    System.out.println("SALIENDO... :(");
                    break;
            }
        } while (opcion != 6);
    }
}
