

public class MaxNum {

    static int searchMax(int a, int b, int c,int d) {
        int max = a;

        if(max < b) max = b;
        if(max < c) max = c;
        if(max < d) max = d;

        return max;
    }

    static int searchMin(int a, int b, int c, int d) {
        int min = a;

        if(min > b) min = b;
        if(min > c) min = c;
        if(min > d) min = d;

        return min;
    }

    public static void main(String[] args) {
        System.out.println(MaxNum.searchMax(3,2,5,1));
        System.out.println(MaxNum.searchMin(3,2,5,1));


    }
}
