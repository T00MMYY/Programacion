package model.validations;

public class UserDataValidations {

    public static boolean checkId(int typeDoc, String id) {
        if (id != null && id.length() == 9) { // Verificamos que el formato solo tenga 9 caracteres 
            System.out.println("NIF valido"); // Damos el mensaje de validacion 
            return true; // Si el formato es correcto devolvemos true
        } else {
            return false; // Si el formato es incorrecto devolvemos false
        }
    }

    public static boolean checkFormatDate(String date) {
        if (date != null && date.matches("\\d{2}/\\d{2}/\\d{4}")) { // Verificamos que el formato de la fecha sea como lo pedimos
            System.out.println("Fecha valida"); // Damos el mensaje de validacion
            return true; // Si el formato es correcto devolvemos true
        } else {
            return false; // Si el formato es incorrecto devolvemos false
        }
    }
    
    public static int calculateAge(String birthDate) {
        if (checkFormatDate(birthDate)) { //Llamamos a la funcion para verificar si el formato de la fecha es correcto
            int year = Integer.parseInt(birthDate.substring(6)); // Extrae el año de la fecha y lo convierte en un valor entero
            int age = 2024 - year; // Restamos el año introducido por el año 2024
            System.out.println("Edad calculada: " + age); // Mostramos mensaje de la edad
            return age; // Devuelve la edad calculada
        } else {
            return -1; // Si el formato no es valido el "-1" indica que algo salio mal
        }
    }
    
    public static boolean checkPostalCode(String zip) {
        if (zip != null && zip.length() == 5) { // Verificamos que el formato solo tenga 5 digitos en este caso
            System.out.println("Codigo postal valido"); // Damos el mensaje de validacion
            return true; // Si el formato es correcto devolvemos true
        } else {
            return false; // Si el formato es incorrecto devolvemos false
        }
    }
    
    public static boolean isNumeric(String str) {
        if (str != null && str.matches("\\d+")) { // La expresion "\\d+" representa un digito y el signo "+" nos indica que debe haber uno o mas caracteres 
            System.out.println("Es numerico"); // Damos el mensaje de validacion
            return true; // Si el formato es correcto devolvemos true
        } else {
            return false; // Si el formato es incorrecto devolvemos false
        }
    }
    
    public static boolean isAlphabetic(String str) {
        if (str != null && str.matches("[a-zA-Z\\s]+")) { // Verificamos que el texto contenga las reglas introducidas "A-Z y a-z" tambien añadimos los espacios entre palabras
            System.out.println("Es alfabetico"); // Damos el mensaje de validacion
            return true; // Si el formato es correcto devolvemos true
        } else {
            return false; // Si el formato es incorrecto devolvemos false
        } 
    }
    
    public static boolean checkEmail(String email) {
        if (email != null && email.contains("@") && email.matches(".+\\.[a-z]{2,6}")) { // Verificamos si el correo tiene "@" y verificamos si el correo acaba con un "." y despues entre 2 y 6 letras
            System.out.println("Correo valido"); // Damos el mensaje de validacion
            return true; // Si el formato es correcto devolvemos true
        } else {
            return false; // Si el formato es incorrecto devolvemos false
        }
    }
    
    public static boolean checkName(String name) {
        if (name != null && name.length() >= 2 && name.length() <= 50 && isAlphabetic(name)) { // El nombre que introduzca el usuario tiene que estar entre el rango de 2 a 50 caracteres
            System.out.println("Nombre valido"); // Damos el mensaje de validacion
            return true; // Si el formato es correcto devolvemos true
        } else {
            return false; // Si el formato es incorrecto devolvemos false
        }
    }
}
