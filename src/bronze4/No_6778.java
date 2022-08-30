package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_6778 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ant = Integer.parseInt(br.readLine());
        int eyes = Integer.parseInt(br.readLine());

        if (ant >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
        }
        if (ant <= 6 && eyes >= 2) {
            System.out.println("VladSaturnian");
        }
        if (ant <= 2 && eyes <= 3) {
            System.out.println("GraemeMercurian");
        }
    }
}
