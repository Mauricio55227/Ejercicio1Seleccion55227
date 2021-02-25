/** 
Universad Autonoma de Campeche
Logica de Programación
Actividad: Elabore un programa que lea tres números enteros e 
imprima el mayor de ellos.
*/
package ejercicio1seleccion55227;
import java.util.Scanner;

/**
 *
 * @author Mauricio Blanquet 
 */
public class Ejercicio1Seleccion55227 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int num1, num2, num3;
  System.out.print("Dame el primer numero: ");
  num1 = sc.nextInt();
  System.out.print("Dame el segundo numero: ");
  num2 = sc.nextInt();
  System.out.print("Dame tercer numero: ");
  num3 = sc.nextInt();
    if (num1 > num2) {
      if (num1 > num3) {
        System.out.println("El numero mayor es: " + num1);                                             
        } else {
       System.out.println("el numero mayor es: " + num3);     
            }
        } else if (num2 > num3) {
            System.out.println("el numero mayor es: " + num2);
        } else {
            System.out.println("el numero mayor es: " + num3);
        }
    }
}
