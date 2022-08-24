import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        float numero;

        System.out.println("Digite un numero : ");
        numero = entrada.nextFloat();
        

        while(numero %1 !=0 || numero == 0){
            System.out.println("El numero ingresado es 0 o no es entero");
            System.out.println("Ingrese un numero que sea entero y diferente de 0");
            numero = entrada.nextFloat();
        }

        if (numero%2==0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        entrada.close();
    }
}
