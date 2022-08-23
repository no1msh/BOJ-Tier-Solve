package bronze4;

import java.io.*;

public class No_19944 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int n = Integer.parseInt(inputStr[0]);
        int m = Integer.parseInt(inputStr[1]);

        if (m < 3){
            System.out.print("NEWBIE!");
        } else if (m <= n) {
            System.out.print("OLDBIE!");
        } else {
            System.out.print("TLE!");
        }

    }
}
