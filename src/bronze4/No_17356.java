package bronze4;

import java.io.*;

public class No_17356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");
        int uk = Integer.parseInt(inputStr[0]);
        int je = Integer.parseInt(inputStr[1]);

        double m = (je - uk) / 400.0;

        System.out.print(1 / (1 + Math.pow(10 , m)));
    }
}
