package Algorithm_0520_0522;

import java.util.Scanner;

// 난이도 4
public class CodeUp1231 {
    public static void main(String[] args) {
        //연산식이 한줄로 입력된다.
        //연산식의 형식은 정수+정수 또는 정수-정수 또는 정수*정수 또는 정수/정수의 형태이다.

        //계산 결과를 정수로 출력한다.
        //나눗셈일 경우 실수로 출력하되 소수 둘째자리까지 출력한다.
        //(0으로 나누는 경우는 입력되지 않는다.)

        Scanner scanner = new Scanner(System.in);
        String inputVal = scanner.nextLine();
        //산술연산자를 구별하기 위해 변수 선언 (ex: 1 -> + , 2 -> -, 3 -> * , 4 -> / )

        int indexChar = 0;

        //산술연산자 기준으로 앞 뒤 값을 넣어줄 배열 선언
        String [] numArr = new String[2];

        if(inputVal.contains("+")) {
            indexChar = 1;
        } else if(inputVal.contains("-")) {
            indexChar = 2;
        } else if(inputVal.contains("*")) {
            indexChar = 3;
        } else if(inputVal.contains("/")) {
            indexChar = 4;
        }

        int num1, num2;
        switch(indexChar) {
                // 덧셈일 경우
            case 1:
                numArr = inputVal.split("\\+");
                num1 = Integer.parseInt(numArr[0]);
                num2 = Integer.parseInt(numArr[1]);
                System.out.println(num1+num2);
                break;

                // 뺄셈일 경우
            case 2:
                numArr = inputVal.split("-");
                num1 = Integer.parseInt(numArr[0]);
                num2 = Integer.parseInt(numArr[1]);
                System.out.println(num1-num2);
                break;

                // 곱셈일 경우
            case 3:
                numArr = inputVal.split("\\*");
                num1 = Integer.parseInt(numArr[0]);
                num2 = Integer.parseInt(numArr[1]);
                System.out.println(num1*num2);
                break;

                // 나눗셈일 경우
            case 4:
                numArr = inputVal.split("/");
                num1 = Integer.parseInt(numArr[0]);
                num2 = Integer.parseInt(numArr[1]);
                //나눗셈은 소수점을 표현해야 해서 float로 형변환 해준 뒤 소수점 2번째 자리까지 출력한다.
                System.out.printf("%.2f", (float)num1/num2);
        }
    }
}
