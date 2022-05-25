package Algorithm_0524;

import java.util.Scanner;

// 무한적으로 입력을 받다가 읽을 수 있는 데이터가 더이상 없을 때 종료시키는 문제.

public class Baek3_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                System.out.println(a + b);
            } catch (Exception e) {
                break;
            }
        }
    }
}
