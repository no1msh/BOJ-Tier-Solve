package bronze4;

import java.io.*;

public class No_11945 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString[] = br.readLine().split(" ");
        int testCase = Integer.parseInt(inputString[0]);

        while (testCase-- > 0) {
            String fishBread = br.readLine();
            for (int i = fishBread.length()-1; i >= 0 ; i--){
                System.out.print(fishBread.charAt(i));
            }

            System.out.println();
        }
    }
}