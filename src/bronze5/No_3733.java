package bronze5;

import java.io.*;

public class No_3733 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while ( (input = br.readLine()) != null){
            String[] inputStr = input.split(" ");
            int n = Integer.parseInt(inputStr[0]);
            int s = Integer.parseInt(inputStr[1]);
            System.out.println(s / (n+1));
        }

    }
}
