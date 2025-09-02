import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamaño del arreglo: ");
        int n = scanner.nextInt();      //S(n)= 1

        int[] arreglo = new int[n];     //S(n)=n
        System.out.println("Ingresa " + n + " números:");
        for (int i = 0; i < n; i++) {       //S(n)=1
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Ingresa el valor a buscar: ");
        int valor = scanner.nextInt();          //S(n)=1

        int comparaciones = buscar(arreglo, valor);     //S(n)= 1
        System.out.println("Comparaciones realizadas: " + comparaciones);
    }

    public static int buscar(int[] arreglo, int valor) {
        int comparaciones = 0;        // T(n)= 1        //S(n)= 1
        for (int i = 0; i < arreglo.length; i++) {   // T(n)= n + 1     //S(n)= 1
            comparaciones++;          // T(n)= n
            if (arreglo[i] == valor) {// T(n)= n
                break;                // T(n)= 1
            }
        }
        return comparaciones;         // T(n)=(9)
    }
    //T(n)=2+1+(n+1)+n+n+n+1
    //T(n)=4n+5

    //S(n)= n + 4+ + 2
    //S(n)= n + 6
}