package Algorithm_0530;

import java.util.Scanner;
// 난이도 1
public class CodeUp1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[10];
        // 숫자 10개 입력
        for(int i=0; i<n.length; i++) {
            n[i] =  scanner.nextInt();
        }
        // k번째 숫자 선언
        int k = scanner.nextInt();

        System.out.println(n[k-1]);

        scanner.close();
    }
}
