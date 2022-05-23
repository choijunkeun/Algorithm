package Algorithm_0523;

import java.util.Scanner;
// 난이도 2
public class CodeUp1071 {
    static Scanner scanner = new Scanner(System.in);

    static void repeat() {
        int a = scanner.nextInt();
        if (a == 0) {
            return;
        }
        System.out.println(a);
        repeat();
    }

    public static void main(String[] args) {
        repeat();
        scanner.close();
    }
}
