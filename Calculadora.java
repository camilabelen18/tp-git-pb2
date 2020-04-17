import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args){

        Integer a;
        Integer b;
        Integer opcion;
        Integer resultado;

        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
            opcion = teclado.nextInt();
        } while(opcion < 1 && opcion > 4);

        System.out.println("Ingrese el primer numero");
        a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = teclado.nextInt();

        if(opcion.equals(3)){
            resultado = sumar(a,b);
        }else if(opcion.equals(2)){
            resultado = restar(a, b);
        }else if(opcion.equals(1)){
            resultado = multiplicar(a, b);
        }else{
            resultado = dividir(a, b);
        }

        System.out.println("El resultado es "+ resultado.toString());

        teclado.close();
    }

    private static int sumar(int a, int b){

        return a + b;
    }

    private static int restar(int a, int b){

        return a - b;
    }


    private static int multiplicar(int a, int b){

        return a * b;
    }


    private static int dividir(int a, int b){

        return a / b;
    }

}