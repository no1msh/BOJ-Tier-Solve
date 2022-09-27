package bronze4;

import java.io.*;

public class No_25191 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxChicken = Integer.parseInt(br.readLine());
        String[] inputStr = br.readLine().split(" ");
        int coke = Integer.parseInt(inputStr[0]);
        int beer = Integer.parseInt(inputStr[1]);

        System.out.println(Math.min(coke / 2 + beer, maxChicken));
    }
}
