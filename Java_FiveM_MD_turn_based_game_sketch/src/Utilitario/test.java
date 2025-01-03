package Utilitario;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Digite la cantidad de pruebas: ");
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            System.out.print("Digite la cantidad de hijas y monedas sobrantes (ejemplo: 2 5): ");
            String[] input = br.readLine().split(" ");
            int hijas = Integer.parseInt(input[0]);
            int monedas = Integer.parseInt(input[1]);

            int min = 0;
            int max = 0;

            for (int i = monedas; i <= 100; i++) {
                int divididas = i / hijas;
                int sobrantes = i - divididas;

                if (sobrantes == monedas) {
                    if (min == 0) {
                        min = i;
                    }
                    max = i;
                }
            }


            System.out.println(min + " " + max);
        }
    }
}
