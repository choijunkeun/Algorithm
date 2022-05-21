package Algorithm_0520;

import java.util.Scanner;
// 난이도 6
public class CodeUp1212 {
    public static void main(String[] args) {
        //세 개의 직선이 있다.
        //숫자의 의미는 직선의 길이를 말한다.
        //이 직선으로 삼각형을 만들 수 있는지 판단하는 프로그램을 작성하시오.
        //삼각형의 성립 조건)
        //a, b, c 가 변의 길이이고 c가 제일 긴 길이라고 한다면
        //c < a + b 이면 삼각형이 성립됨.

        //삼각형이 가능하면 "yes", 삼각형을 만들 수 없다면 "no"를 출력하시오.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] arrList = {a,b,c};

        for(int i = 0; i < arrList.length-1; i++) {
            for(int j = 0; j <arrList.length-i-1; j++) {
                if(arrList[j+1] < arrList[j]) {
                int tmp = arrList[j];
                arrList[j] = arrList[j + 1];
                arrList[j + 1] = tmp;
            }
            }
        }
        if(arrList[2] < arrList[1] + arrList[0]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
