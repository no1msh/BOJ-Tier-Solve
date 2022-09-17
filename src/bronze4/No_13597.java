package bronze4;

import java.io.*;

public class No_13597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int a = Integer.parseInt(inputStr[0]);
        int b = Integer.parseInt(inputStr[1]);

        if (a >= b){
            System.out.print(a);
        } else {
            System.out.print(b);
        }
    }
}
