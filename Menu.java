import java.util.Scanner;
import java.lang.System;

public class Menu{
	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		int opcion=0;
		/*                                                                aquí ↓ debería ir el usuario que está utilizando la app*/
		System.out.println("### SISTEMA DE PREGUNTAS Y RESPUESTAS ###\n## Registrado como: User123 ##\nEscoja su opción:\n1. Agregar nueva pregunta\n2. Responder pregunta\n3. Dar recompensa\n4. Aceptar respuesta\n5. Cerrar sesión\n6. Salir del programa\n");
		System.out.println("INTRODUZCA SU OPCIÓN: ");
		/*
		### SISTEMA DE PREGUNTAS Y RESPUESTAS ###
		## Registrado como: User123 ##
		Escoja su opción:
		1. Agregar nueva pregunta
		2. Responder pregunta
		3. Dar recompensa
		4. Aceptar respuesta
		5. Cerrar sesión
		6. Salir del programa
		INTRODUZCA SU OPCIÓN: _
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
				/*Cerrar Sesión*/
				break;

			case 6:
				/*Salir del programa*/
				System.exit(0);
				break;

			default:
				System.out.println("Error, no existe esa opción\n");
				break;
		}
	}
}