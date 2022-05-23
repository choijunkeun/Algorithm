package Algorithm_0523;

import java.util.Scanner;
// 난이도 2
public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a;
        boolean repeat = true;
        while(repeat) {
            a = scanner.next().charAt(0);
            System.out.println(a);
            if(a=='q') {
                repeat = false;
            }

        }
        scanner.close();
    }
}
