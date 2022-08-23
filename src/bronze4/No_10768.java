package bronze4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_10768 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        //월 일만 잘 분리해서 출력해주면 된다.
        if(month < 2) {
            System.out.println("Before");
        }else if(month == 2){
            if(day < 18) {
                System.out.println("Before");
            }else if(day == 18) {
                System.out.println("Special");
            }else {
                System.out.println("After");
            }
        }else {
            System.out.println("After");
        }
    }

}
