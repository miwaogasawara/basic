package ex;

public class FxFor1 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        int sum = 0;
        for (int num:array) {
            sum += num;
        }
            System.out.println(sum);
            System.out.println((double) sum / array.length );
        }
    }

    /*
    for each 文
     for (int num:array)：ex-FxFor.javaと同じ動きになります。
     for (int i = 0; i < array.length; i++)?・・・ex-FxFor.javaの構文と同じ、array=numです。

    結果
    150
    30.0
     */

