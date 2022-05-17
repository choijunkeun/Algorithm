package Algorithm_0517;

import java.util.Scanner;

// 난이도 1
public class CodeUp1051 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(a<=b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
