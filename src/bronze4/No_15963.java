package bronze4;

import java.io.*;

public class No_15963 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        if (inputStr[0].equals(inputStr[1])) System.out.print(1);
        else System.out.print(0);
    }
}
