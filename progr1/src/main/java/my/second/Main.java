import java.util.function.BinaryOperator;

public class Main {


    public static void main(String[] args) {
        int[] array = {3, 3, 4, 5, 3};
        //System.out.println(compare(array));   // 32 16 8 4 2 1
        System.out.println(counter(37));     //  1    1
    }

    public static boolean compare(int[] arrayList) {
        int sum = arrayList[0] + arrayList[arrayList.length - 1];
        for (int i = 1; i < arrayList.length - 1; i++) {
            if (arrayList[i] == sum) {
                return true;
            }
        }
        return false;
    }


    public static int counter(int N) {
        /*Rozwiązanie trenera
        int max = 0;
        int current= 0;
        boolean q = false;
        while (N > 0){
            int bit = N%2;
            if (N%2==0){
                if (q){
                    current++;
                }
            }else {
                q = true;
                if (current > max){
                    max = current;
                }
                current = 0;
            }
            N = N /2;
        }
        return max;
*/


        /*Rozwiązanie moje*/
        int result = 0;
        int count = 0;

        String text = Integer.toBinaryString(N);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '0') {
                count++;
                if (count > result) {
                    result = count;
                }
            } else {
                count = 0;
            }
        }
        return result;
        /*codilla -> 80%*/

    }

}
