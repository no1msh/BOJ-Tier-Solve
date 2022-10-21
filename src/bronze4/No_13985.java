package bronze4;

import java.io.*;

public class No_13985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int a = Integer.parseInt(inputStr[0]);
        int b = Integer.parseInt(inputStr[2]);
        int c = Integer.parseInt(inputStr[4]);

        if ( a + b == c){
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }
}
