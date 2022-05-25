package Algorithm_0524;

import java.util.Scanner;


// 아직 다 못품.. 
public class Baek3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        // 10보다 작으면 01 , 02, 03 .. 09 로 만들어준다.
        if(Integer.parseInt(num)<10) {
            num = "0"+num;
        }

        while(true) {
            String oriNum = num;    // ex : oriNum = 26 ,num = 26
            int num1 = Integer.parseInt(num.substring(0,1)); // 2
            int num2 = Integer.parseInt(num.substring(1,2)); // 6
            String result = String.valueOf(num1 + num2); // 8

            num = String.valueOf(num2) + result.substring(0,1);    // 68

            System.out.println(num);
            if (oriNum.equals(num)) {
                break;
            }
        }
    }
}
