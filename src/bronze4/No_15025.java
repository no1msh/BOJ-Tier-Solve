package bronze4;

import java.io.*;

public class No_15025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");
        int leftHorn = Integer.parseInt(inputStr[0]);
        int rightHorn = Integer.parseInt(inputStr[1]);

        if (leftHorn + rightHorn == 0){
            System.out.print("Not a moose");
        } else if (leftHorn == rightHorn){
            System.out.print("Even " + leftHorn * 2);
        } else {
            System.out.print("Odd " + Math.max(leftHorn, rightHorn)*2);
        }
    }
}
