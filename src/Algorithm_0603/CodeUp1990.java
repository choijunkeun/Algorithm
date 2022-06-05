package Algorithm_0603;

import java.util.Scanner;

public class CodeUp1990 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        // String 형태로 숫자를 받은 후 문자열을 char로 변환해서 각 index에 넣어준다. ex) 123 -> '1','2','3'
        char[] num = n.toCharArray();

        int sum = 0;
        for(int i=0; i<num.length; i++) {
            sum += num[i];
        }

        //3의 배수인지 확인
        if(sum % 3 == 0){
            System.out.print("1");
        } else{
            System.out.print("0");
        }
    }
}
