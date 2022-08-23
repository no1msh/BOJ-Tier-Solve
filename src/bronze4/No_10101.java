package bronze4;

import java.io.*;

public class No_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a + b + c == 180) {
            if (a == b && b == c) {
                System.out.print("Equilateral");
            } else if (a != b && b != c && a != c) {
                System.out.print("Scalene");
            } else {
                System.out.print("Isosceles");
            }
        } else {
            System.out.print("Error");
        }
    }
}
