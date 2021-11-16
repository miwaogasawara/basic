package intro2;

import java.util.Arrays;

//配列の合計 拡張for版
public class SumSample2 {
    public static void main(String[] args) {
        //整数型配列の宣言
        int[] array = {20,30,10,50,40};
        //合計を保存する変数の宣言
        int sum = 0;

        //反復処理をしつつ合計を求める
        for (int value:array) {
            sum += value;//合計に加算
        }

        //配列の内容を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html#toString(int%5B%5D)
        System.out.println(Arrays.toString(array));//[20, 30, 10, 50, 40]

        //合計を表示
        System.out.println("配列の合計:" + sum);//配列の合計:150
    }
}


