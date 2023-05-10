/*
 Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package eggproyectoguia9pooutilejextra1;

import java.util.Scanner;
import java.util.Random;

public class Meses {

   
    public static void main(String[] args) {
       
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
        Random random = new Random();
        int mesSecretoIndex = random.nextInt(meses.length);
        String mesSecreto = meses[mesSecretoIndex];
        Scanner scanner = new Scanner(System.in);
        String mesAdivinado;
        int intentos = 0;
        do {
            System.out.println("Adivine el mes secreto.");
            System.out.println("------------------------");
            System.out.print("Introducir el nombre del mes en minusculas: ");
            mesAdivinado = scanner.next();
            intentos++;
            if (!mesAdivinado.equals(mesSecreto)) {
                System.out.println("No ha acertado!!!. Ingrese nuevamente otro mes. ");
            }
        } while (!mesAdivinado.equals(mesSecreto) && intentos < 3);
        if (mesAdivinado.equals(mesSecreto)) {
            System.out.println("**Ha acertado**");
        } else {
            System.out.println("--No ha acertado--. El mes secreto era " + mesSecreto + ".");
        }
    }
}

