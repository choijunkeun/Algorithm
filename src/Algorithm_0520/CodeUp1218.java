package Algorithm_0520;

import java.util.Scanner;

public class CodeUp1218 {
    public static void main(String[] args) {
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
        a = arrList[0];
        b = arrList[1];
        c = arrList[2];

        if (a==b && b==c) {
            System.out.println("정삼각형");
        } else if(c>=a+b){
            System.out.println("삼각형아님");
        } else if(a==b || b==c || a==c) {
            System.out.println("이등변삼각형");
        } else if((a*a)+(b*b)==(c*c)) {
            System.out.println("직각삼각형");
        } else if(c<a+b) {
            System.out.println("삼각형");
        }
    }
}
