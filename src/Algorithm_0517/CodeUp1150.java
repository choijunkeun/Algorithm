package Algorithm_0517;

import java.util.Scanner;

// 난이도 2
public class CodeUp1150 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println((a<b?a:b)<c?(a<b?a:b):c);
    }
}
