package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_4589 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gnomes:");
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            String[] inputStr = br.readLine().split(" ");
            int a = Integer.parseInt(inputStr[0]);
            int b = Integer.parseInt(inputStr[1]);
            int c = Integer.parseInt(inputStr[2]);

            if (a < b && b < c) {
                System.out.println("Ordered");
            } else if (a > b && b > c) {
                System.out.println("Ordered");
            } else {
                System.out.println("Unordered");
            }
        }
    }
}