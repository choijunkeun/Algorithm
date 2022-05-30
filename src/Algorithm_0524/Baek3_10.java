package Algorithm_0524;

import java.util.Scanner;

// 난이도 4
public class Baek3_10 {
    public static void main(String[] args) {
        //별 찍기
        // 입력 : 5
        // 출력 :
        //    *
        //   **
        //  ***
        // ****
        //*****

        // 0 0 0 0 1
        // 0 0 0 1 1
        // 0 0 1 1 1
        // 0 1 1 1 1
        // 1 1 1 1 1
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
