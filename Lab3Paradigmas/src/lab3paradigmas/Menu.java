package lab3paradigmas;

import java.util.Scanner;

/**
 *
 * @author Jaime Carrasco
 */
public class Menu{
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        int opcion;
        System.out.println("Bienvenido al sistema de preguntas y respuestas\n1)Iniciar Sesión\n2)Registrarse\n3)Salir");
        System.out.println("Ingrese su opción:");
        opcion=input.nextInt();

        Usuario usuario;
        String user="", clave;

        switch (opcion) {
            case 1:
                //verificar inicio de sesión
                break;

            case 2:
                Scanner userInput= new Scanner(System.in);
                System.out.println("\nIngrese un nombre de usuario: ");
                user=userInput.nextLine();

                //verificar si existe usuario
                //si no existe el usuario, crearlo

                
                Scanner passInput= new Scanner(System.in);
                System.out.println("\nIngrese su contraseña: ");
                clave=passInput.nextLine();
                
                usuario=new Usuario(user,clave,0);
                System.out.println("Usuario creado con éxito");

                usuario.imprimirDatos();


                break;

            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("Error, no existe esa opción\n");
        }






        /*                                                                aquÃ­ â†“ deberÃ­a ir el usuario que estÃ¡ utilizando la app*/
        System.out.println("### SISTEMA DE PREGUNTAS Y RESPUESTAS ###\n## Registrado como:"+ user + "##\nEscoja su opciÃ³n:\n1. Agregar nueva pregunta\n2. Responder pregunta\n3. Dar recompensa\n4. Aceptar respuesta\n5. Cerrar sesiÃ³n\n6. Salir del programa\n");
        System.out.println("INTRODUZCA SU OPCIÃ“N: ");
        /*
        ### SISTEMA DE PREGUNTAS Y RESPUESTAS ###
        ## Registrado como: User123 ##
        Escoja su opciÃ³n:
        1. Agregar nueva pregunta
        2. Responder pregunta
        3. Dar recompensa
        4. Aceptar respuesta
        5. Cerrar sesiÃ³n
        6. Salir del programa
        INTRODUZCA SU OPCIÃ“N: _
        */
        opcion=input.nextInt();

        switch(opcion){

            case 1:
                    /*Agregar nueva pregunta*/
                    break;

            case 2:
                    /*Responder pregunta*/
                    break;

            case 3:
                    /*Dar recompensa*/
                    break;

            case 4:
                    /*Aceptar respuesta*/
                    break;

            case 5:
                    /*Cerrar SesiÃ³n*/
                    break;

            case 6:
                    /*Salir del programa*/
                    System.exit(0);
                    break;

            default:
                    System.out.println("Error, no existe esa opciÃ³n\n");
                    break;
        }
    }
}
