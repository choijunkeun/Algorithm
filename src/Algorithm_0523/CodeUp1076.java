package Algorithm_0523;

import java.util.Scanner;

// 난이도 2
public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x = scanner.next().charAt(0);
        boolean repeat = true;

        for(char i='a'; i<=x; i++) {
            System.out.print(i+" ");
        }


        //출력 한계 초과 뜸
//        while (repeat){
//            System.out.print(i++ +" ");
//
//            if(i==x) {
//                System.out.println(i);
//                repeat = false;
//            }
//        }
        scanner.close();
    }
}
