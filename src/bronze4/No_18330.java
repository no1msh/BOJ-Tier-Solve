package bronze4;

import java.io.*;

public class No_18330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int needFuel = Integer.parseInt(br.readLine());
        int currentFuelCard = Integer.parseInt(br.readLine());

        if(currentFuelCard + 60 >= needFuel){
            System.out.println((needFuel)* 1500);
        } else {
            System.out.println(((needFuel - (currentFuelCard + 60)) * 3000) + (currentFuelCard + 60) * 1500);
        }

    }

}
