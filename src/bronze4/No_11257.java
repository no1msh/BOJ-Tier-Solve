package bronze4;

import java.io.*;

public class No_11257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0){
            String[] student = br.readLine().split(" ");
            String studentName = student[0];
            int strategy = Integer.parseInt(student[1]);
            int management = Integer.parseInt(student[2]);
            int technology = Integer.parseInt(student[3]);
            int totalScore = strategy + management + technology;

            if (totalScore >= 55 && strategy >= 10.5 && management >= 7.5 && technology >= 12){
                System.out.println(studentName + " " + totalScore + " PASS");
            } else {
                System.out.println(studentName + " " + totalScore + " FAIL");
            }
        }
    }
}
