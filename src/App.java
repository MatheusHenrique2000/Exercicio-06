import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Peça o raio de um circulo 
        Scanner sc = new Scanner(System.in);
        System.out.print("Coloque o raio do circulo ");
        double raio = sc.nextDouble();
        sc.close();

        // Calcular a area do circulo
        // = PI () * Potência (x,2)
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do circulo de raio " + raio + " é igual a " + area);

    }
}