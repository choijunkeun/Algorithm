package Algorithm_0604;

import java.util.Scanner;

public class Baek7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 1;
        int range = 2;

        if (n==1) {
            System.out.println(1);
        } else {
            while (range<=n) {
                range = range+(6*cnt);
                cnt++;
            }
            System.out.println(cnt);
        }


    }
}
