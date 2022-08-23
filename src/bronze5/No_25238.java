package bronze5;

import java.io.*;

public class No_25238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputStr = br.readLine().split(" ");
        double a = Double.parseDouble(inputStr[0]);
        double b = Double.parseDouble(inputStr[1]);

        if (a - (a * b / 100.0) >= 100)
            System.out.print(0);
        else
            System.out.print(1);
    }
}
