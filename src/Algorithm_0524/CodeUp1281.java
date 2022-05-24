package Algorithm_0524;

import java.util.Scanner;

public class CodeUp1281 {
    public static void main(String[] args) {
        //자연수 a, b 사이의 구간에 대해서 홀수는 더하고 짝수는 빼는 식을 보여준 후 결과를 출력하시오.
        //예)
        //a=5, b=10 인 경우, 5-6+7-8+9-10=-3
        //a=6, b=9 인 경우, -6+7-8+9=2
        //홀수는 더하고 짝수는 뺀 식을 보여준후 결과를 출력한다.
        //식을 나열할때 양수인 경우 불필요하게 '+'를 붙여서 출력하지 않는다.

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(strResult(a,b) + "="+result(a,b));


    }
    static int result(int a, int b) {
        int sum = 0;
        for(int i=a; i<=b; i++) {
            if(i%2==0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }
    static String strResult(int a, int b) {
        String str = "";
        if(a%2!=0) {
            str += String.valueOf(a);
        } else {
            str += "-" + String.valueOf(a);
        }

        for(int i=a+1; i<=b; i++) {
            if(i%2==0) {
                str += "-" + String.valueOf(i);
            } else {
                str += "+" + String.valueOf(i);
            }
        }
        return str;
    }

}
