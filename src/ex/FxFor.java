package ex;

public class FxFor {
    public static void main(String[] args) {
        int[] array = {20, 30, 10, 50, 40};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println(sum);
            System.out.println((double) sum / array.length);

        }
    }
}
/*

{20,30,10,50,40}を順に合計し、結果出力する
 sum += array[i]：合計はarray[i]
 System.out.println((double) sum / array.length )：平均を出力、
 小数点委なるのでdoubleを付けます。

 */