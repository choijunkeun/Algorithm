package Algorithm_0517;

import java.util.Scanner;

// 난이도 2
public class CodeUp1060 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.printf("%d\n", a&b);
    }

//        아래는 잘못 작성하다 멈춘 방법.. 왜 비트연산자를 잊었을까..
//    static String toBinaryString(int x) {
//        String zero = "00000000000000000000000000000000"; // 4byte(32bit)
//        String tmp = zero + Integer.toBinaryString(x); // Integer.toBinaryString()은 들어온 정수(10진수)를 2진수의 String값으로 바꿔준다. ex) x:3  => "00000000000000000000000000000000" + "11"
//        return tmp.substring(toBinaryString(x).length());   // substring()은 첫글자부터 매개변수로 들어온 값 까지의 문자열을 제거한 후 나머지 값을 리턴한다.
//    }
}
