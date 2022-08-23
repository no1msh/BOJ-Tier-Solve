package bronze5;

import java.io.*;

public class No_24078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());

        System.out.print(inputNum % 21);
    }
}
