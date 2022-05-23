package Algorithm_0520_0522;

import java.util.Scanner;

// 난이도 3
public class CodeUp1173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour, minute;

        hour = scanner.nextInt();
        minute = scanner.nextInt();

        if(minute<30) {
            minute = 60-(30-minute);
            if(hour==0) {
                hour = 23;
            } else {
                hour--;
            }
            System.out.println(hour + " " + minute);
        } else {
            System.out.println(hour + " " + (minute-30));
        }
    }
}
