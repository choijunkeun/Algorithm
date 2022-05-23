package Algorithm_0520_0522;

import java.util.Scanner;

// 난이도 1.. 설명에 답이 나와있네 ..
public class CodeUp1224 {
    public static void main(String[] args) {
        //a / b  >  c / d  이면  > 를 출력,
        //a / b =  c / d  이면  = 를 출력,
        //a / b  <  c / d  이면 < 를 출력.

        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextInt();
        float b = scanner.nextInt();
        float c = scanner.nextInt();
        float d = scanner.nextInt();

        if((a/b)>(c/d)) {
            System.out.println(">");
        } else if((a/b)==(c/d)) {
            System.out.println("=");
        } else if((a/b)<(c/d)) {
            System.out.println("<");
        }
    }
}
