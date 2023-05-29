public class MedNum {

    static int searchMed(int a, int b, int c) {

       // a 가 중간일 때    a = 3 , b = 1  , c = 5
        // b가 중간일 때    a = 1 , b = 3  , c = 5
        if(a >= b) {
            if(b >= c) {
                return b;
            } else if(a <= c) {
                return a;
            } else {
                return c;
            }
        } else {    // b > a 일 경우
            if(a > c) {
                return a;
            } else if(c > b) {
                return b;
            } else {
                return c;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(MedNum.searchMed(1,3,5));
        System.out.println(MedNum.searchMed(1,5,3));
        System.out.println(MedNum.searchMed(3,1,5));
        System.out.println(MedNum.searchMed(3,5,1));
        System.out.println(MedNum.searchMed(5,1,3));
        System.out.println(MedNum.searchMed(5,3,1));

    }
}
