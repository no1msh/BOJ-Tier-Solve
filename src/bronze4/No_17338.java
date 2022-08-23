package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_17338 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int a = Integer.parseInt(inputStr[0]);
        int b = Integer.parseInt(inputStr[1]);
        int c = Integer.parseInt(inputStr[2]);

        if (a + b + c < 100) {
            System.out.print("OK");
        } else {
            if (a < b && b < c) {
                System.out.print("Soongsil");
            } else if (b < c && c < a) {
                System.out.print("Korea");
            } else {
                System.out.print("Hanyang");
            }
        }
    }
}
