package portalmed;
import java.util.Scanner;
public class Interfaz_Paciente{

public static void() {
    Scanner teclado = new Scanner(System.in);
    int usuario, contraseña, opc;
    int[] ID_paciente;
    System.out.println("Escribe tu usuario");
    usuario = teclado.nextInt();
    System.out.println("Escribe tu contraseña");
    contraseña = teclado.nextInt();
    /*Agregar ciclo if
     para validar contraseña*/
    do {
        switch(opc) {
            case 1:
                Historial_medico():
            case 2:
                datosPersonales():
            case 3:
                agendarCita():
            case 4:
                historialRecetas():
        }
    }
}

}