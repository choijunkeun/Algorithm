package Algorithm_0517;

import java.util.Scanner;
// 난이도 2
public class Baek2_3 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if((a%4==0 && a%100!=0) || a%400==0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
