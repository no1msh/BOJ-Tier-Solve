package bronze4;

import java.io.*;

public class No_19698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");
        int cow = Integer.parseInt(inputStr[0]);
        int cowHouseX = Integer.parseInt(inputStr[1]);
        int cowHouseY = Integer.parseInt(inputStr[2]);
        int cowArea = Integer.parseInt(inputStr[3]);

        if(((cowHouseX / cowArea) * (cowHouseY / cowArea)) > cow){
            System.out.println(cow);
        } else {
            System.out.println((cowHouseX / cowArea) * (cowHouseY / cowArea));
        }

    }
}
