package Algorithm_0519;

import java.util.Scanner;
// 난이도 1
public class CodeUp1153 {
    public static void main(String[] args) {
        // 두 정수가 입력된다.  두 정수의 크기를 비교하여 왼쪽 수가 크면 > 를 출력, 오른쪽 수가 크면 < 를 출력, 같으면 = 을 출력하시오.
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(a>b) {
            System.out.println(">");
        } else if (a<b) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }
    }
}
