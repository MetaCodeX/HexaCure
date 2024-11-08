package portalmed;
import java.util.Scanner;
public class Interfaz_Paciente{

public static void interfazPaciente(){
    Scanner teclado = new Scanner(System.in);
    int usuario, contraseña, opc;
    int[] ID_paciente;
    System.out.println("Escribe tu usuario");
    usuario = teclado.nextInt();
    System.out.println("Escribe tu contraseña");
    contraseña = teclado.nextInt();
    /*Agregar ciclo if
     para validar usuario y contraseña*/
    System.out.println("Selecciona una opción por favcr");
    opc = teclado.nextInt();
    do{
        switch(opc){
            case 1:
                historialMedico.Historial();
            case 2:
                datosPersonales.infoPersonal();
            case 3:
                agendarCita():
            case 4:
                historialRecetas():
        }
    }
}

}