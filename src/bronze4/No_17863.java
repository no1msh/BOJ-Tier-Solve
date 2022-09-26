package bronze4;

import java.io.*;

public class No_17863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputNumber = br.readLine();
        if (inputNumber.charAt(0) == '5' && inputNumber.charAt(1) == '5' && inputNumber.charAt(2) == '5') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
