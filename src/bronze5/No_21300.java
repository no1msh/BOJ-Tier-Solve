package bronze5;

import java.io.*;

public class No_21300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputBottle = br.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < inputBottle.length; i++) {
            sum += Integer.parseInt(inputBottle[i]);
        }
        System.out.print(sum * 5);

    }
}
