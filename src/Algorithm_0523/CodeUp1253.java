package Algorithm_0523;

import java.util.Scanner;
// 난이도 2
public class CodeUp1253 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while(a!=b) {
            if (a>b) {
                System.out.print(b + " ");
                b++;
            } else if(a<b){
                System.out.print(a + " ");
                a++;
            }
        }
        System.out.println(a>b?a:b);
        scanner.close();
    }
}
