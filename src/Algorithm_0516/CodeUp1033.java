package Algorithm_0516;


import java.util.Scanner;
// 난이도 1
// 10진수 1개 입력받아 16진수로 변환하여 출력하기
public class CodeUp1033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // %X 로 출력시 16진수 대문자로 출력된다.
        System.out.printf("%X", num);
    }
}
