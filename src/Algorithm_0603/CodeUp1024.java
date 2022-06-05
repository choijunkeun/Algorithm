package Algorithm_0603;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        //단어(영어) 하나를 입력받는다.
        //(단, 단어의 길이는 20자 이하이다.)

        //단어의 문자(영어)를 하나씩 나누어 한 줄에 한 개씩
        //' '로 묶어서 출력한다.

        Scanner scanner = new Scanner(System.in);
        String voca = scanner.nextLine();

        String[] vocaArr = voca.split("");

        for(int i=0; i<vocaArr.length; i++) {
            System.out.println("'" + vocaArr[i] + "'");
        }
        scanner.close();
    }
}
