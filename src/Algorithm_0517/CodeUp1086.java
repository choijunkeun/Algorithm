package Algorithm_0517;

import java.util.Scanner;
// 난이도 3
public class CodeUp1086 {
    public static void main(String[] args) {
        int w,h,b;
        Scanner scanner = new Scanner(System.in);
        w = scanner.nextInt();
        h = scanner.nextInt();
        b = scanner.nextInt();

        double vol = ((long)w*h*b)/8;
        System.out.printf("%.2f MB", vol/1024/1024);
    }
}
