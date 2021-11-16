package ex;

import java.util.Arrays;

public class AveSample1 {
    public static void main(String[] args) {
        //整数型配列の宣言
        int[] array = {20,30,10,50,40};

        //合計を保存する変数の宣言
        int sum = 0;

        //平均を保存する変数の宣言
        double ave = 0;

        //反復処理をしつつ合計を求める
        for (int i = 0; i < array.length; i++) {
            sum += array[i];//合計に加算
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array));//[20, 30, 10, 50, 40]

        //平均を求める
        ave = (double) sum / array.length;//double型へキャストしないと整数になります

        //平均の表示
        System.out.println("平均:" + ave);//平均:30.0
    }
}


