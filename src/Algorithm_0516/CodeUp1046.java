package Algorithm_0516;

import java.util.Scanner;
// 난이도 2
// 합과 평균을 줄을 바꿔 출력한다.
// 평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력한다.
public class CodeUp1046 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int sum = a+b+c;
        float div = (float)sum/3;
        System.out.println(sum);
        System.out.printf("%.1f", div);
    }
}
