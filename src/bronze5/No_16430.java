package bronze5;

import java.io.*;

public class No_16430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStringArray = br.readLine().split(" ");

        int a = Integer.parseInt(inputStringArray[0]);
        int b = Integer.parseInt(inputStringArray[1]);

        System.out.print(b - a + " " + b);

    }
}
