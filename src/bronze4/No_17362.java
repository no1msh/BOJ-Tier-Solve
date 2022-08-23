package bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_17362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if ( n % 8 == 1) {
            System.out.print(1);
        } else if(n % 8 == 0 || n % 8 == 2){
            System.out.print(2);
        } else if(n % 8 == 3 || n % 8 == 7){
            System.out.print(3);
        } else if(n % 8 == 4 || n % 8 == 6){
            System.out.print(4);
        } else {
            System.out.print(5);
        }

    }
}
