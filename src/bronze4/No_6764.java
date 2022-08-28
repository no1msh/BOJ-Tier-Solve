package bronze4;

import java.io.*;

public class No_6764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        if (a < b && b < c && c < d){
            System.out.print("Fish Rising");
        } else if (a > b && b > c && c > d){
            System.out.print("Fish Diving");
        } else if (a == b && b == c && c == d){
            System.out.print("Fish At Constant Depth");
        } else {
            System.out.print("No Fish");
        }
    }
}
