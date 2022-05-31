package Algorithm_0530;

import java.util.Scanner;

// 난이도 3~4
public class CodeUp1411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 카드 장수
        int[] n = new int[scanner.nextInt()];

        // 1 ~ N까지의 수 합
        int total = 0;

        // 1 ~ N까지의 입력한 값의 합
        int sum = 0;

        // 카드 번호 입력
        for(int i=0;i<n.length-1; i++) {
            n[i] = scanner.nextInt();
            sum += n[i];
        }

        for(int i=1; i<=n.length; i++) {
            total += i;
        }
        System.out.println(total - sum);

        scanner.close();
    }
}
