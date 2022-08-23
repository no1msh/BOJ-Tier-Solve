package bronze4;

import java.io.*;

public class No_16199 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] inputString = br.readLine().split(" ");
        String[] inputString2 = br.readLine().split(" ");
        int birthYear = Integer.parseInt(inputString[0]);
        int birthMonth = Integer.parseInt(inputString[1]);
        int birthDay = Integer.parseInt(inputString[2]);
        int standardYear = Integer.parseInt(inputString2[0]);
        int standardMonth = Integer.parseInt(inputString2[1]);
        int standardDay = Integer.parseInt(inputString2[2]);

        int manOld;
        if (standardYear == birthYear) { // 두 연도가 같을 경우 무조건 0살
            manOld = 0;
        } else { // 두 연도가 다른 경우
            if (standardMonth < birthMonth) { // 두 연도가 다르면서 생달이 기준달 보다 클경우
                manOld = standardYear - birthYear - 1;
            } else if (standardMonth == birthMonth) { // 두 연도가 다르면서 기준달이 생달과 같을 경우
                if (standardDay < birthDay) { // 두 연도가 다르면서 기준달이 생달과 같으면서 기준일이 생일 보다 작을 경우
                    manOld = standardYear - birthYear - 1;
                } else { // 두 연도가 달면서 기준달이 생달과 같으면서 기준일 보다 생일이 클 경우
                    manOld = standardYear - birthYear;
                }
            } else { // 두 연도가 다르면서 기준달이 생달 보다 클경우
                manOld = standardYear - birthYear;
            }

        }

        int old = standardYear - birthYear + 1;
        int yearOld = standardYear - birthYear;

        sb.append(manOld).append("\n").append(old).append("\n").append(yearOld);
        System.out.print(sb);
    }
}