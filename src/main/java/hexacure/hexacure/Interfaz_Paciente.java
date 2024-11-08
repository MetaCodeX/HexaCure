package hexacure.hexacure;
import java.util.Scanner;

public class Interfaz_Paciente {

    public static void interfazPaciente() {
        Scanner teclado = new Scanner(System.in);
        int usuario, contraseña, opc;
        System.out.println("Escribe tu usuario");
        usuario = teclado.nextInt();
        System.out.println("Escribe tu contraseña");
        contraseña = teclado.nextInt();



        do {
            System.out.println("Selecciona una opción por favor");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    historialMedico.Historial();
                    break;
                case 2:
                    datosPersonales.infoPersonal();
                    break;
                case 3:
                    agendarCita();
                    break;
                case 4:
                    historialRecetas();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opc != 0);
    }

    public static void agendarCita() {

    }

    public static void historialRecetas() {

    }
}
