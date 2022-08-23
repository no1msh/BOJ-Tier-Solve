package bronze5;

import java.io.*;

public class No_15727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int distance = Integer.parseInt(br.readLine());

        if (distance % 5 == 0){
            System.out.print(distance / 5);
        } else {
            System.out.print(distance / 5 + 1);
        }
    }
}
