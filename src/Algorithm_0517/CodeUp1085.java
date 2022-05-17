package Algorithm_0517;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        int h,b,c,s;
        Scanner scanner = new Scanner(System.in);
        h = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        s = scanner.nextInt();
        float vol = ((h*b*c*s)/8); //byte
        System.out.printf("%.1f MB", vol);

    }
}
