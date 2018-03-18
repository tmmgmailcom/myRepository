public class Main {
    public static void main(String[] args) {
        //example(5);

        System.out.println(fibRec(46));
        //System.out.println(fibIter(46));
     //   System.out.println(powRek(3, 2));
    }

    public static int fibRec(int n){
        if (n < 3) {
            return 1;
        }
        return fibRec(n-2) + fibRec(n-1);
    }
    public static int fibIter(int n){
        int a = 1;
        int b = 1;
        int res;
        for (int i = 3; i <= n; i++) {
            res = a+b;
            a = b;
            b = res;
        }
        return b;
    }

    public static double powRek (double x, int n){
        // x do potegi n
        if (n == 0){
            return 1;
        }
        for (int i = 0; i <=n ; i++) {

        }
        return 1;
    }




    public static void example(int n){
        int i = 1;
        int count=0;

        while (i<=n){                               //n-1
            int j = 0;
            while (j<i){                            //i-1 -> n-1
                for (int k = 0; k <=100 ; k++) {
                    //count ++;
                }
                j++;
            }
            i++;
        }
        System.out.println(count);
    }
}
