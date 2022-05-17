package Algorithm_0517;

import java.util.Scanner;

// 난이도 1
public class Baek2_4 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(a>=0 && b>=0) {
            System.out.println(1);
        } else if (a<0 && b>=0) {
            System.out.println(2);
        } else if (a<0 && b<0) {
            System.out.println(3);
        } else if (a>=0 && b<0) {
            System.out.println(4);
        }
    }
}
