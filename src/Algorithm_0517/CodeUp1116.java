package Algorithm_0517;

import java.util.Scanner;
// 난이도 1
public class CodeUp1116 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.printf("%d+%d=%d\n", a, b, a+b);
        System.out.printf("%d-%d=%d\n", a, b, a-b);
        System.out.printf("%d*%d=%d\n", a, b, a*b);
        System.out.printf("%d/%d=%d\n", a, b, a/b);
    }
}
