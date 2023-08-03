import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe 3 inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int maior = maiorValor(x, y, z);

        printMaior(maior);

        sc.close();
    }

    public static int maiorValor(int a, int b, int c) {

        if((a > b) && (a > c)) return a;
        else if(b > c) return b;
        else return c;

    }

    public static void printMaior(int maior) {
        System.out.printf("Maior valor informado = %d%n", maior);
    }
}
