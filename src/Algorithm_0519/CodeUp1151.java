package Algorithm_0519;

import java.util.Scanner;

// 난이도 1
public class CodeUp1151 {
    public static void main(String[] args) {
        //10보다 작은 수가 입력되면 small 을 출력, 10이상이면 아무것도 출력하지 마시오.
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        if(a<10) {
            System.out.println("small");
        }
    }
}
