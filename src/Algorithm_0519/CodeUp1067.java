package Algorithm_0519;

import java.util.Scanner;
// 난이도 1
public class CodeUp1067 {
    public static void main(String[] args) {
        //정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if(a>=0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }

        if(a%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
