package Algorithm_0607;

import java.util.Scanner;

public class Baek_2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 총 옮겨야 하는 설탕
        int n = scanner.nextInt();


        scanner.close();

        // 5
        int x = n/5;
        int y = 0;
        while(true) {
            int n2 = n -(x*5);
            if(n2%3==0) {
                y = n2/3;
                break;
            }
            if(x==0 && y==0) {
                break;
            }
            if(x != 0) {
                x--;
            }
        }
        if((x+y)!=0) {
            System.out.println(x+y);
        } else {
            System.out.println(-1);
        }
    }
}
