package bronze4;

import java.io.*;

public class No_1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String inputString = br.readLine();
            int count = 0;

            if (inputString.equals("#")){
                break;
            }

            for (int i = 0 ; i < inputString.length(); i++){
                if (inputString.charAt(i) == 'a'
                    || inputString.charAt(i) == 'e'
                    || inputString.charAt(i) == 'i'
                    || inputString.charAt(i) == 'o'
                    || inputString.charAt(i) == 'u'
                    || inputString.charAt(i) == 'A'
                    || inputString.charAt(i) == 'E'
                    || inputString.charAt(i) == 'I'
                    || inputString.charAt(i) == 'O'
                    || inputString.charAt(i) == 'U'){
                    count++;
                }

            }
            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}
