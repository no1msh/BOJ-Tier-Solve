package bronze5;

import java.io.*;

public class No_10807 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        String[] inputStr = br.readLine().split(" ");
        int findNum = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0 ; i < testCase; i++){
            if (findNum == Integer.parseInt(inputStr[i]))
                count++;
        }

        System.out.print(count);

    }
}
