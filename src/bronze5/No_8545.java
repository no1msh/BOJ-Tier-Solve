package bronze5;

import java.io.*;

public class No_8545 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();

        for (int i = inputString.length()-1 ; i >= 0; i--){
            System.out.print(inputString.charAt(i));
        }
    }
}
