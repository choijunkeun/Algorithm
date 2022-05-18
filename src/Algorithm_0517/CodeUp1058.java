package Algorithm_0517;

import java.util.Scanner;

// 난이도 1
public class CodeUp1058 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(a==0&&b==0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
