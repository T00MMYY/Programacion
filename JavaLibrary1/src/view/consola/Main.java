package view.consola;

import java.util.Scanner;
import model.validations.UserDataValidations;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("");
            System.out.println("1. Validar NIF");
            System.out.println("2. Validar formato de fecha");
            System.out.println("3. Calcular edad");
            System.out.println("4. Validar codigo postal");
            System.out.println("5. Validar que el contenido es numerico");
            System.out.println("6. Validar que el contenido es alfabetico");
            System.out.println("7. Validar correo electronico");
            System.out.println("8. Validar nombre");
            System.out.println("0. Salir");

            System.out.print("Ingrese su opcion: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;

                case 8:
                    ejercicio8();
                    break;
                case 0:
                    System.out.println("Saliste del menu.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
    }

    static void ejercicio1() {

        System.out.print("Ingrese el tipo de documento (1 para NIF): ");
        int typeDoc = scan.nextInt();
        scan.nextLine();
        System.out.print("Ingrese el NIF: ");
        String id = scan.nextLine();
        System.out.println("Resultado: " + UserDataValidations.checkId(typeDoc, id));
    }

    static void ejercicio2() {

        System.out.print("Ingrese la fecha en formato dd/mm/aaaa: ");
        String date = scan.nextLine();
        System.out.println("Resultado: " + UserDataValidations.checkFormatDate(date));
    }
    static void ejercicio3() {
        System.out.print("Ingrese la fecha de nacimiento en formato dd/mm/aaaa: ");
        String birthDate = scan.nextLine();
        int age = UserDataValidations.calculateAge(birthDate);
        if (age == -1) {
            System.out.println("Fecha de nacimiento invalida.");
        } else {
            System.out.println("Edad: " + age);
        }
    }

    static void ejercicio4() {
        System.out.print("Ingrese el codigo postal: ");
        String zip = scan.nextLine();
        System.out.println("Resultado: " + UserDataValidations.checkPostalCode(zip));
    }

    static void ejercicio5() {
        System.out.print("Ingrese un numero: ");
        String numText = scan.nextLine();
        System.out.println("Resultado: " + UserDataValidations.isNumeric(numText));
    }

    static void ejercicio6() {
        System.out.print("Ingrese un texto: ");
        String alphaText = scan.nextLine();
        System.out.println("Resultado: " + UserDataValidations.isAlphabetic(alphaText));
    }

    static void ejercicio7() {
        System.out.print("Ingrese el correo electronico: ");
        String email = scan.nextLine();
        System.out.println("Resultado: " + UserDataValidations.checkEmail(email));
    }

    static void ejercicio8() {
        System.out.print("Ingrese el nombre: ");
        String name = scan.nextLine();
        System.out.println("Resultado: " + UserDataValidations.checkName(name));
    }
}

