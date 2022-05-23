package Algorithm_0520_0522;

import java.util.Scanner;
// 난이도 1
public class CodeUp1207 {
    public static void main(String[] args) {
        //도 : 1개가 뒤집어진 상태
        //개 : 2개가 뒤집어진 상태
        //걸 : 3개가 뒤집어진 상태
        //윷 : 4개가 뒤집어진 상태
        //모 : 하나도 뒤집어지지 않은 상태

        //① 윷의 4가지 상태가 공백으로 구분되어 입력된다.
        //② 윷의 상태가 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태를 의미한다.

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int total = a+b+c+d;

        switch(total) {
            case 0:
                System.out.println("모");
                break;
            case 1:
                System.out.println("도");
                break;
            case 2:
                System.out.println("개");
                break;
            case 3:
                System.out.println("걸");
                break;
            case 4:
                System.out.println("윷");
                break;
        }
    }
}
