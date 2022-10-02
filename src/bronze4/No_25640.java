package bronze4;

import java.io.*;

public class No_25640 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mbti = br.readLine();
        int testCase = Integer.parseInt(br.readLine());
        int count = 0;
        while (testCase -- > 0){
            if (br.readLine().equals(mbti)){
                count++;
            }
        }
        System.out.print(count);
    }
}
