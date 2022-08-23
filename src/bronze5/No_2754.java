package bronze5;

import java.io.*;

public class No_2754 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputScore = br.readLine();

        if (inputScore.equals("A+")) {
            System.out.print(4.3);
        } else if (inputScore.equals("A0")) {
            System.out.print(4.0);
        } else if (inputScore.equals("A-")) {
            System.out.print(3.7);
        } else if (inputScore.equals("B+")) {
            System.out.print(3.3);
        } else if (inputScore.equals("B0")) {
            System.out.print(3.0);
        } else if (inputScore.equals("B-")) {
            System.out.print(2.7);
        } else if (inputScore.equals("C+")) {
            System.out.print(2.3);
        } else if (inputScore.equals("C0")) {
            System.out.print(2.0);
        } else if (inputScore.equals("C-")) {
            System.out.print(1.7);
        } else if (inputScore.equals("D+")) {
            System.out.print(1.3);
        } else if (inputScore.equals("D0")) {
            System.out.print(1.0);
        } else if (inputScore.equals("D-")) {
            System.out.print(0.7);
        } else {
            System.out.print(0.0);
        }
    }
}
