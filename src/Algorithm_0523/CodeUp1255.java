package Algorithm_0523;

import java.util.Scanner;
// 난이도 2
public class CodeUp1255 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        while(a<=b) {
            System.out.printf("%.2f ", a);
            a += 0.01;
        }
        scanner.close();
    }
}
