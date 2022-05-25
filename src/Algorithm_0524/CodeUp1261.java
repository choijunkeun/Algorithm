package Algorithm_0524;

import java.util.Scanner;

//10개의 수가 입력된다.
//10개의 수 중 5의 배수를 하나만 출력한다.
//만약 5의 배수가 없다면 0을 출력한다.

// 난이도 3 (맞음)
public class CodeUp1261 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];

        int multiple = 0;

        // 반복문으로 10개의 자연수 입력 받아 배열에 저장
        for(int i=0; i<num.length; i++) {
            num[i] = scanner.nextInt();
            if(num[i]%5==0) {
                multiple = num[i];
            }
        }
        if(multiple!=0) {
            System.out.println(multiple);
        } else {
            System.out.println(0);
        }
    }
}
