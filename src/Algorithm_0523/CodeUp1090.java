package Algorithm_0523;

import java.util.Scanner;
// 난이도 2
public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r = scanner.nextInt();
        int n = scanner.nextInt();

        long result = a;
        for(int i=1; i<n; i++) {
            result = result*r;
        }
        System.out.println(result);

        scanner.close();

    }
}
