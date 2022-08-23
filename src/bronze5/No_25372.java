package bronze5;

import java.io.*;

public class No_25372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0){
            String inputStr = br.readLine();
            if(inputStr.length() >= 6 && inputStr.length() <= 9){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}