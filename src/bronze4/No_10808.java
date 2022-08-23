package bronze4;

import java.io.*;

public class No_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int[] alphabet = new int[26];
        for (int i = 0 ; i < inputStr.length(); i++){
            alphabet[inputStr.charAt(i)-97]++;
        }

        for (int i = 0; i < alphabet.length; i++){
            System.out.print(alphabet[i]+" ");
        }
    }
}
