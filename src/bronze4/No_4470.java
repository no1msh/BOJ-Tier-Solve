package bronze4;

import java.io.*;

public class No_4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int index = 1;
        while( testCase-- > 0 ){
            System.out.println(index++ + ". " + br.readLine());
        }
    }
}
