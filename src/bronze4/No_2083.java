package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] inputStr = br.readLine().split(" ");
            String name = inputStr[0];
            int age = Integer.parseInt(inputStr[1]);
            int weight = Integer.parseInt(inputStr[2]);

            if (name.equals("#")){
                break;
            }

            if (age > 17 || weight >= 80){
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }

        }
    }
}
