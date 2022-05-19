package Algorithm_0519;

import java.util.Scanner;
// 난이도 1
public class CodeUp1065 {
    public static void main(String[] args) {
        //세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a%2==0) {
            System.out.println(a);
        }
        if(b%2==0) {
            System.out.println(b);
        }
        if(c%2==0) {
            System.out.println(c);
        }
    }
}
