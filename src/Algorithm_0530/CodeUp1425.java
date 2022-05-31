package Algorithm_0530;

import java.util.Arrays;
import java.util.Scanner;
// 표현에러..? 일단 정답은 맞음
public class CodeUp1425 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] students = new int[scanner.nextInt()];
        int line = scanner.nextInt();
        for (int i = 0; i < students.length; i++) {
            students[i] = scanner.nextInt();
        }

        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
            if(i==line-1) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
