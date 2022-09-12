package bronze4;

import java.io.*;

public class No_13623 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String a = input[0];
        String b = input[1];
        String c = input[2];

        if (a.equals(b) && b.equals(c)) {
            System.out.print("*");
        } else {
            if (a.equals(b)) {
                System.out.print("C");
            } else if (b.equals(c)) {
                System.out.print("A");
            } else {
                System.out.print("B");
            }
        }

    }
}
