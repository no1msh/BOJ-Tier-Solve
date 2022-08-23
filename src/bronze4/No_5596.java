package bronze4;

import java.io.*;

public class No_5596 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputScore1 = br.readLine().split(" ");
        String[] inputScore2 = br.readLine().split(" ");
        int totalScore1 = 0;
        int totalScore2 = 0;

        for (int i = 0; i < inputScore1.length ; i++){
            totalScore1 += Integer.parseInt(inputScore1[i]);
        }
        for (int i = 0; i < inputScore2.length ; i++){
            totalScore2 += Integer.parseInt(inputScore2[i]);
        }

        if(totalScore1 > totalScore2){
            System.out.print(totalScore1);
        } else {
            System.out.print(totalScore2);
        }
    }
}
