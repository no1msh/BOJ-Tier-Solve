package bronze5;

import java.io.*;

public class No_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String inputString = "";
        while((inputString = br.readLine()) != null){
            sb.append(inputString).append("\n");
        }
        System.out.print(sb);
    }
}