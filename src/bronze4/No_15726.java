package bronze4;

import java.io.*;

public class No_15726 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");
        double a = Double.parseDouble(inputStr[0]);
        double b = Double.parseDouble(inputStr[1]);
        double c = Double.parseDouble(inputStr[2]);

        System.out.println((int) Math.max((a * b / c), (a / b * c)));
    }

}