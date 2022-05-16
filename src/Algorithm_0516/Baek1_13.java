package Algorithm_0516;


import java.util.Scanner;

// (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
// 그림은 https://www.acmicpc.net/problem/2588 참고
public class Baek1_13 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        int b1 = b%10; // ex) b = 385 일 경우 5
        int b2 = b/10; // ex) b = 385 일 경우 38
        int b2_2 = b2%10; //  ex) b = 385 일 경우 38%10 = 8
        int b3 = b/100;  // ex) b = 385 일 경우 3

        System.out.println(a*b1);
        System.out.println(a*b2_2);
        System.out.println(a*b3);
        System.out.println(a*b);
    }
}
