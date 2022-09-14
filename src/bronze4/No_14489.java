package bronze4;

import java.io.*;

public class No_14489 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");
        int account1 = Integer.parseInt(inputStr[0]);
        int account2 = Integer.parseInt(inputStr[1]);
        int chicken = Integer.parseInt(br.readLine());

        if ((account1 + account2) >= 2 * chicken) {
            System.out.print(account1 + account2 - 2 * chicken);
        } else {
            System.out.print(account1 + account2);
        }

    }
}
