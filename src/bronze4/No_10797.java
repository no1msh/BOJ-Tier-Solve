package bronze4;

import java.io.*;

public class No_10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int day = Integer.parseInt(br.readLine());
        String[] carNums = br.readLine().split(" ");

        int count = 0;

        for (String value : carNums){
            if ( day == Integer.parseInt(value)){
                count++;
            }
        }

        System.out.print(count);

    }
}
