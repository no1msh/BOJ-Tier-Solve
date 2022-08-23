package bronze5;

import java.io.*;

public class No_17256 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputCake1 = br.readLine().split(" ");
        String[] inputCake2 = br.readLine().split(" ");

        int[] cakeA = new int[3];
        int[] cakeB = new int[3];
        int[] cakeC = new int[3];

        for (int i = 0 ; i<cakeA.length; i++){
            cakeA[i] = Integer.parseInt(inputCake1[i]);
            cakeC[i] = Integer.parseInt(inputCake2[i]);
        }

        cakeB[0] = cakeC[0] - cakeA[2];
        cakeB[1] = cakeC[1] / cakeA[1];
        cakeB[2] = cakeC[2] - cakeA[0];

        for(int value: cakeB){
            System.out.print(value+" ");
        }
    }
}
