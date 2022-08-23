package bronze4;

import java.io.*;

public class No_24883 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();
        if (inputString.charAt(0) == 'N' || inputString.charAt(0) == 'n'){
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }
    }
}
