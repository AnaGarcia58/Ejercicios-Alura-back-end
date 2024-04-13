import java.io.PrintStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nombre = "Meredith Grey";
        String tipoDeCuenta = "Cuenta Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println(String.format(
                """ 
                        *************************************
                        Nombre del cliente: %s
                        Tipo de Cuenta: %s
                        Saldo = %.2f
                        *************************************
                        """, nombre, tipoDeCuenta, saldo).formatted());

        String menu = """
                *** Escriba el número de la opción deseada ***
                1 - Consultar saldo.
                2 - Retirar.
                3 - Depositar.
                9 - Salir.
                """;
        while (opcion != 9) {
            System.out.println(menu);
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("Ingrese el valor que desea retirar");
                    double valorARetirar = scanner.nextDouble();
                    if (saldo < valorARetirar) {
                        System.out.println("El saldo es insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("Su saldo actual es: " + saldo + "$");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el valor que desea depositar");
                    double valorADepositar = scanner.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("Su saldo actual es: " + saldo + "$");
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;

            }

        }
    }

}
